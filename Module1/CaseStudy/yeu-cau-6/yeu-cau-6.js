class Customer {
  constructor(
    fullName,
    identityNumber,
    birthDay,
    email,
    address,
    customerType,
    discountRate,
    guestCount,
    rentDays,
    serviceType,
    roomType
  ) {
    this.fullName = fullName;
    this.identityNumber = identityNumber;
    this.birthDay = birthDay;
    this.email = email;
    this.address = address;
    this.customerType = customerType;
    this.discountRate = discountRate;
    this.guestCount = guestCount;
    this.rentDays = rentDays;
    this.serviceType = serviceType;
    this.roomType = roomType;
  }
  getFullName() {
    return this.fullName;
  }
  getIdentityNumber() {
    return this.identityNumber;
  }
  getBirthDay() {
    return this.birthDay;
  }
  getEmail() {
    return this.email;
  }
  getAddress() {
    return this.address;
  }
  getCustomerType() {
    return this.customerType;
  }
  getDiscountRate() {
    return this.discountRate;
  }
  getGuestCount() {
    return this.guestCount;
  }
  getRentDays() {
    return this.rentDays;
  }
  getServiceType() {
    return this.serviceType;
  }
  getRoomType() {
    return this.roomType;
  }
  setFullName(fullName) {
    this.fullName = fullName;
  }
  setIdentityNumber(identityNumber) {
    this.identityNumber = identityNumber;
  }
  setBirthDay(birthDay) {
    this.birthDay = birthDay;
  }
  setEmail(email) {
    this.email = email;
  }
  setAddress(address) {
    this.address = address;
  }
  setCustomerType(customerType) {
    this.customerType = customerType;
  }
  setDiscountRate(discountRate) {
    this.discountRate = discountRate;
  }
  setGuestCount(guestCount) {
    this.guestCount = guestCount;
  }
  setRentDays(rentDays) {
    this.rentDays = rentDays;
  }
  setServiceType(serviceType) {
    this.serviceType = serviceType;
  }
  setRoomType(roomType) {
    this.roomType = roomType;
  }
  getPrice() {
    let servicePrice;
    switch (this.serviceType) {
      case "Room ($100/day)":
        servicePrice = 100;
        break;
      case "House ($300/day)":
        servicePrice = 300;
        break;
      case "Villa ($500/day)":
        servicePrice = 500;
        break;
    }
    return servicePrice * this.rentDays * (1 - this.discountRate / 100);
  }
}

class Employee {
  constructor(fullName, identityNumber, birthDay, email, address, employeePosition) {
    this.fullName = fullName;
    this.identityNumber = identityNumber;
    this.birthDay = birthDay;
    this.email = email;
    this.address = address;
    this.employeePosition = employeePosition;
  }
  getFullName() {
    return this.fullName;
  }
  getIdentityNumber() {
    return this.identityNumber;
  }
  getBirthDay() {
    return this.birthDay;
  }
  getEmail() {
    return this.email;
  }
  getAddress() {
    return this.address;
  }
  getEmployeePosition() {
    return this.employeePosition;
  }
  setFullName(fullName) {
    this.fullName = fullName;
  }
  setIdentityNumber(identityNumber) {
    this.identityNumber = identityNumber;
  }
  setBirthDay(birthDay) {
    this.birthDay = birthDay;
  }
  setEmail(email) {
    this.email = email;
  }
  setAddress(address) {
    this.address = address;
  }
  setEmployeePosition(employeePosition) {
    this.employeePosition = employeePosition;
  }
  getBounty() {
    switch (this.employeePosition) {
      case "Manager":
        return 500;
      case "Sale":
        return 300;
      case "Marketing":
        return 200;
    }
  }
}

const mainMenu = document.getElementById("mainMenu");
const mainButton = document.getElementById("mainButton");
const addButton = document.getElementById("addButton");
const displayButton = document.getElementById("displayButton");
const addEmployeeButton = document.getElementById("addEmployeeButton");
const displayEmployeeButton = document.getElementById("displayEmployeeButton");
const mainMenuButtons = [addButton, displayButton, addEmployeeButton, displayEmployeeButton];
const customerForm = document.getElementById("customerForm");
const fullName = document.getElementById("fullName");
const identityNumber = document.getElementById("identityNumber");
const birthDay = document.getElementById("birthDay");
const email = document.getElementById("email");
const address = document.getElementById("address");
const customerType = document.getElementById("customerType");
const discountRate = document.getElementById("discountRate");
const guestCount = document.getElementById("guestCount");
const rentDays = document.getElementById("rentDays");
const serviceType = document.getElementById("serviceType");
const roomType = document.getElementById("roomType");
const addCustomerButton = document.getElementById("addCustomerButton");
const updateCustomerInfoButton = document.getElementById("updateCustomerInfoButton");
const customerTable = document.getElementById("customerTable");
const submitForValidate = document.getElementById("submitForValidate");
const addEmployeeToListButton = document.getElementById("addEmployeeToListButton");
const updateEmployeeInfoButton = document.getElementById("updateEmployeeInfoButton");
const employeeFullName = document.getElementById("employeeFullName");
const employeeIdentityNumber = document.getElementById("employeeIdentityNumber");
const employeeBirthDay = document.getElementById("employeeBirthDay");
const employeeEmail = document.getElementById("employeeEmail");
const employeeAddress = document.getElementById("employeeAddress");
const employeePosition = document.getElementById("employeePosition");
const employeeTable = document.getElementById("employeeTable");
const employeeForm = document.getElementById("employeeForm");

const customersList = [];
const employeeList = [];

function displayMainMenu() {
  for (let index = 0; index < mainMenuButtons.length; index += 1) {
    mainMenuButtons[index].hidden = false;
  }
  mainButton.hidden = true;
}

function addNewCustomer() {
  customerForm.hidden = false;
  addCustomerButton.hidden = false;
  mainMenu.hidden = true;
  customerTable.hidden = true;
}

function getCurrentInfo() {
  return new Customer(
    fullName.value,
    identityNumber.value,
    birthDay.value,
    email.value,
    address.value,
    customerType.value,
    discountRate.value,
    guestCount.value,
    rentDays.value,
    serviceType.value,
    roomType.value
  );
}

function getCustomersTableHTML() {
  if (customersList.length <= 0) {
    return "<h3>We have 0 customer!</h3>";
  }
  let html = `<h3>Customer List</h3>
  <table id="customersTable"><tr>
  <th>Full name</th>
  <th>Identity Number</th>
  <th>Birthday</th>
  <th>Email</th>
  <th>Address</th>
  <th>Customer Type</th>
  <th>Discount</th>
  <th>Guest count</th>
  <th>Rent days</th>
  <th>Service Type</th>
  <th>Room Type</th>
  <th>Show Price</th>
  <th>Edit</th>
  <th>Delete</th>
  </tr>`;
  customersList.forEach((customer) => {
    html += `<tr>
    <td>${customer.getFullName()}</td>
    <td>${customer.getIdentityNumber()}</td>
    <td>${customer.getBirthDay()}</td>
    <td>${customer.getEmail()}</td>
    <td>${customer.getAddress()}</td>
    <td>${customer.getCustomerType()}</td>
    <td>${customer.getDiscountRate()}</td>
    <td>${customer.getGuestCount()}</td>
    <td>${customer.getRentDays()}</td>
    <td>${customer.getServiceType()}</td>
    <td>${customer.getRoomType()}</td>
    <td><button type="button" onclick="showPrice(${customersList.indexOf(customer)})">Total pay</td>
    <td><button type="button" onclick="editCustomerInfo(${customersList.indexOf(customer)})">Edit</td>
    <td><button type="button" onclick="deleteCustomerInfo(${customersList.indexOf(customer)})">Delete</td>
    </tr>`;
  });
  html += "</table>";
  return html;
}

function isAllRequiredFieldFilled() {
  return customerForm.checkValidity();
}

function addCustomerToList() {
  if (!isAllRequiredFieldFilled()) {
    submitForValidate.click();
    return;
  }
  const customer = getCurrentInfo();
  customersList.push(customer);
  customerForm.hidden = true;
  mainMenu.hidden = false;
  addCustomerButton.hidden = true;
  customerTable.innerHTML = getCustomersTableHTML();
  customerTable.hidden = false;
}

function updateCustomerInfo(position) {
  if (!isAllRequiredFieldFilled()) {
    submitForValidate.click();
    return;
  }
  const customer = customersList[position];
  customer.setFullName(fullName.value);
  customer.setIdentityNumber(identityNumber.value);
  customer.setBirthDay(birthDay.value);
  customer.setEmail(email.value);
  customer.setAddress(address.value);
  customer.setCustomerType(customerType.value);
  customer.setDiscountRate(discountRate.value);
  customer.setGuestCount(guestCount.value);
  customer.setRentDays(rentDays.value);
  customer.setServiceType(serviceType.value);
  customer.setRoomType(roomType.value);
  customerForm.hidden = true;
  updateCustomerInfoButton.hidden = true;
  addCustomerButton.hidden = true;
  mainMenu.hidden = false;
  customerTable.innerHTML = getCustomersTableHTML();
  customerTable.hidden = false;
}

function editCustomerInfo(position) {
  const customer = customersList[position];
  customerForm.hidden = false;
  updateCustomerInfoButton.hidden = false;
  addCustomerButton.hidden = true;
  mainMenu.hidden = true;
  customerTable.hidden = true;
  fullName.value = customer.getFullName();
  identityNumber.value = customer.getIdentityNumber();
  birthDay.value = customer.getBirthDay();
  email.value = customer.getEmail();
  customerType.value = customer.getCustomerType();
  discountRate.value = customer.getDiscountRate();
  guestCount.value = customer.getGuestCount();
  rentDays.value = customer.getRentDays();
  serviceType.value = customer.getServiceType();
  roomType.value = customer.getRoomType();
  updateCustomerInfoButton.onclick = () => {
    updateCustomerInfo(position);
  };
}

function deleteCustomerInfo(position) {
  const customer = customersList[position];
  if (confirm(`Do you want to delete the info of ${customer.getFullName()}?`)) {
    customersList.splice(position, 1);
  }
  customerTable.innerHTML = getCustomersTableHTML();
}

function showPrice(position) {
  const customer = customersList[position];
  const message = `Total pay is ${customer.getPrice()}`;
  alert(message);
}

function displayCustomerTable() {
  customerTable.innerHTML = getCustomersTableHTML();
  customerTable.hidden = false;
}

mainButton.addEventListener("click", displayMainMenu);
addButton.addEventListener("click", addNewCustomer);
addCustomerButton.addEventListener("click", addCustomerToList);
displayButton.addEventListener("click", displayCustomerTable);

function getEmployeeTableHTML() {
  if (employeeList.length <= 0) {
    return "<h3>We have 0 employee!</h3>";
  }
  let html = `<h3>Employee List</h3>
  <table id="customersTable"><tr>
  <th>Full name</th>
  <th>Identity Number</th>
  <th>Birthday</th>
  <th>Email</th>
  <th>Address</th>
  <th>Employee position</th>
  <th>Bounty</th>
  <th>Edit</th>
  <th>Delete</th>
  </tr>`;
  employeeList.forEach((employee) => {
    html += `<tr>
    <td>${employee.getFullName()}</td>
    <td>${employee.getIdentityNumber()}</td>
    <td>${employee.getBirthDay()}</td>
    <td>${employee.getEmail()}</td>
    <td>${employee.getAddress()}</td>
    <td>${employee.getEmployeePosition()}</td>
    <td>${employee.getBounty()}</td>
    <td><button type="button" onclick="editEmployeeInfo(${employeeList.indexOf(employee)})">Edit</td>
    <td><button type="button" onclick="deleteEmployeeInfo(${employeeList.indexOf(employee)})">Delete</td>
    </tr>`;
  });
  html += "</table>";
  return html;
}

displayEmployeeButton.addEventListener("click", () => {
  employeeTable.hidden = false;
  employeeTable.innerHTML = getEmployeeTableHTML();
});

addEmployeeButton.addEventListener("click", () => {
  employeeForm.hidden = false;
  addEmployeeToListButton.hidden = false;
  updateEmployeeInfoButton.hidden = true;
  customerTable.hidden = true;
  employeeTable.hidden = true;
});

addEmployeeToListButton.addEventListener("click", () => {
  if (employeeForm.reportValidity()) {
    const employee = new Employee();
    employee.setFullName(employeeFullName.value);
    employee.setIdentityNumber(employeeIdentityNumber.value);
    employee.setBirthDay(employeeBirthDay.value);
    employee.setEmail(employeeEmail.value);
    employee.setAddress(employeeAddress.value);
    employee.setEmployeePosition(employeePosition.value);
    employeeList.push(employee);
    employeeForm.hidden = true;
    addEmployeeToListButton.hidden = true;
    employeeTable.innerHTML = getEmployeeTableHTML();
    employeeTable.hidden = false;
  }
});

function editEmployeeInfo(position) {
  const employee = employeeList[position];
  employeeFullName.value = employee.getFullName();
  employeeIdentityNumber.value = employee.getIdentityNumber();
  employeeBirthDay.value = employee.getBirthDay();
  employeeEmail.value = employee.getEmail();
  employeeAddress.value = employee.getAddress();
  employeePosition.value = employee.getEmployeePosition();
  employeeForm.hidden = false;
  updateEmployeeInfoButton.hidden = false;
  employeeTable.hidden = true;
  addEmployeeToListButton.hidden = true;
  updateEmployeeInfoButton.onclick = () => {
    employee.setFullName(employeeFullName.value);
    employee.setIdentityNumber(employeeIdentityNumber.value);
    employee.setBirthDay(employeeBirthDay.value);
    employee.setEmail(employeeEmail.value);
    employee.setAddress(employeeAddress.value);
    employee.setEmployeePosition(employeePosition.value);
    employeeForm.hidden = true;
    updateEmployeeInfoButton.hidden = true;
    addEmployeeToListButton.hidden = true;
    employeeTable.hidden = false;
    employeeTable.innerHTML = getEmployeeTableHTML();
  };
}

function deleteEmployeeInfo(position) {
  const employee = employeeList[position];
  if (confirm(`Delete ${employee.getFullName()}?`)) {
    employeeList.splice(position, 1);
    employeeTable.innerHTML = getEmployeeTableHTML();
  }
}
