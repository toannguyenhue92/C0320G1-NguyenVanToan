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

const mainMenu = document.getElementById("mainMenu");
const mainButton = document.getElementById("mainButton");
const addButton = document.getElementById("addButton");
const displayButton = document.getElementById("displayButton");
const mainMenuButtons = [addButton, displayButton];
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
const addToListButton = document.getElementById("addToListButton");
const updateCustomerInfoButton = document.getElementById("updateCustomerInfoButton");
const customersTable = document.getElementById("customersTable");
const submitForValidate = document.getElementById("submitForValidate");
const customersList = [];

function displayMainMenu() {
  for (let index = 0; index < mainMenuButtons.length; index += 1) {
    mainMenuButtons[index].hidden = false;
  }
  mainButton.hidden = true;
}

function addNewCustomer() {
  customerForm.hidden = false;
  addToListButton.hidden = false;
  mainMenu.hidden = true;
  customersTable.hidden = true;
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
  let html = `<table id="customersTable"><tr>
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
  addToListButton.hidden = true;
  customersTable.innerHTML = getCustomersTableHTML();
  customersTable.hidden = false;
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
  addToListButton.hidden = true;
  mainMenu.hidden = false;
  customersTable.innerHTML = getCustomersTableHTML();
  customersTable.hidden = false;
}

function editCustomerInfo(position) {
  const customer = customersList[position];
  customerForm.hidden = false;
  updateCustomerInfoButton.hidden = false;
  addToListButton.hidden = true;
  mainMenu.hidden = true;
  customersTable.hidden = true;
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
  customersTable.innerHTML = getCustomersTableHTML();
}

function showPrice(position) {
  const customer = customersList[position];
  const message = `Total pay is ${customer.getPrice()}`;
  alert(message);
}

function displayCustomerTable() {
  customersTable.innerHTML = getCustomersTableHTML();
  customersTable.hidden = false;
}

mainButton.addEventListener("click", displayMainMenu);
addButton.addEventListener("click", addNewCustomer);
addToListButton.addEventListener("click", addCustomerToList);
displayButton.addEventListener("click", displayCustomerTable);
