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

const addToListButton = document.getElementById("addToListButton");
const updateCustomerInfoButton = document.getElementById("updateCustomerInfoButton");

const customersTable = document.getElementById("customersTable");

const formEmployee = document.getElementById("formEmployee");

const customersList = [];

function displayMainMenu() {
  for (let index = 0; index < mainMenuButtons.length; index += 1) {
    mainMenuButtons[index].hidden = false;
  }
  mainButton.hidden = true;
}

mainButton.addEventListener("click", displayMainMenu);

function addNewCustomer() {
  customerForm.hidden = false;
  addToListButton.hidden = false;
  mainMenu.hidden = true;
  customersTable.hidden = true;
}

addButton.addEventListener("click", addNewCustomer);

function getCurrentInfo() {
  return {
    fullName: fullName.value,
    identityNumber: identityNumber.value,
    birthDay: birthDay.value,
    email: email.value,
    address: address.value,
    customerType: customerType.value,
    discountRate: discountRate.value,
    guestCount: guestCount.value,
    rentDays: rentDays.value,
    serviceType: serviceType.value,
    roomType: roomType.value,
  };
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
  <th>Edit</th>
  <th>Delete</th>
  </tr>`;
  customersList.forEach((customer) => {
    html += `<tr>
    <td>${customer.fullName}</td>
    <td>${customer.identityNumber}</td>
    <td>${customer.birthDay}</td>
    <td>${customer.email}</td>
    <td>${customer.address}</td>
    <td>${customer.customerType}</td>
    <td>${customer.discountRate}</td>
    <td>${customer.guestCount}</td>
    <td>${customer.rentDays}</td>
    <td>${customer.serviceType}</td>
    <td>${customer.roomType}</td>
    <td><button type="button" onclick="editCustomer(${customersList.indexOf(customer)})">Edit</td>
    <td><button type="button" onclick="deleteCustomer(${customersList.indexOf(customer)})">Delete</td>
    </tr>`;
  });
  html += "</table>";
  return html;
}

function addCustomerToList() {
  const customer = getCurrentInfo();
  customersList.push(customer);
  customerForm.hidden = true;
  mainMenu.hidden = false;
  addToListButton.hidden = true;
  customersTable.innerHTML = getCustomersTableHTML();
  customersTable.hidden = false;
}

addToListButton.addEventListener("click", addCustomerToList);

displayButton.addEventListener("click", () => {
  customersTable.innerHTML = getCustomersTableHTML();
  customersTable.hidden = false;
});

function updateCustomerInfo(position) {
  const customer = customersList[position];
  customer.fullName = fullName.value;
  customer.identityNumber = identityNumber.value;
  customer.birthDay = birthDay.value;
  customer.email = email.value;
  customer.address = address.value;
  customer.customerType = customerType.value;
  customer.discountRate = discountRate.value;
  customer.guestCount = guestCount.value;
  customer.rentDays = rentDays.value;
  customer.serviceType = serviceType.value;
  customer.roomType = roomType.value;

  customerForm.hidden = true;
  updateCustomerInfoButton.hidden = true;
  addToListButton.hidden = true;
  mainMenu.hidden = false;

  customersTable.innerHTML = getCustomersTableHTML();
  customersTable.hidden = false;
}

function editCustomer(position) {
  const customer = customersList[position];

  customerForm.hidden = false;
  updateCustomerInfoButton.hidden = false;
  addToListButton.hidden = true;
  mainMenu.hidden = true;
  customersTable.hidden = true;

  fullName.value = customer.fullName;
  identityNumber.value = customer.identityNumber;
  birthDay.value = customer.birthDay;
  email.value = customer.email;
  customerType.value = customer.customerType;
  discountRate.value = customer.discountRate;
  guestCount.value = customer.guestCount;
  rentDays.value = customer.rentDays;
  serviceType.value = customer.serviceType;
  roomType.value = customer.roomType;

  updateCustomerInfoButton.onclick = () => {
    updateCustomerInfo(position);
  };
}

function deleteCustomer(position) {
  const customer = customersList[position];
  if (confirm(`Do you want to delete the info of ${customer.fullName}?`)) {
    customersList.splice(position, 1);
  }
  customersTable.innerHTML = getCustomersTableHTML();
}
