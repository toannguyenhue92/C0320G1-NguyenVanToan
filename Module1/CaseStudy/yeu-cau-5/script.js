// Menu buttons
const mainMenu = document.getElementById('mainMenu');
const mainButton = document.getElementById('mainButton');
const addButton = document.getElementById('addButton');
const displayButton = document.getElementById('displayButton');
const editButton = document.getElementById('editButton');
const deleteButton = document.getElementById('deleteButton');
const exitButton = document.getElementById('exitButton');
const mainMenuButtons = [addButton, displayButton, editButton, deleteButton, exitButton];

// Customer Form
const customerForm = document.getElementById('customerForm');
const addToList = document.getElementById('addToList');

function displayMainMenu() {
  for (let index = 0; index < mainMenuButtons.length; index += 1) {
    mainMenuButtons[index].hidden = false;
  }
  mainButton.hidden = true;
}

mainButton.addEventListener('click', displayMainMenu);

function addNewCustomer() {
  customerForm.hidden = false;
  mainMenu.hidden = true;
}

addButton.addEventListener('click', addNewCustomer);

function addCustomerToList() {
  // TODO: task 2
  customerForm.hidden = true;
  mainMenu.hidden = false;
}
addToList.addEventListener('click', addCustomerToList);
