function showBookingInfo() {
  let fullName = document.getElementById("fullName").value;
  let identityNumber = document.getElementById("identityNumber").value;
  let birthDay = document.getElementById("birthDay").value;
  let email = document.getElementById("email").value;
  let address = document.getElementById("address").value;
  let customerType = document.getElementById("customerType").value;
  let discoutRate = parseInt(document.getElementById("discoutRate").value);
  let guestCount = document.getElementById("guestCount").value;
  let rentDays = parseInt(document.getElementById("rentDays").value);
  let serviceType = document.getElementById("serviceType").value;
  let roomType = document.getElementById("roomType").value;
  let servicePrice;
  switch (serviceType) {
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
  discoutRate = isNaN(discoutRate) ? 0 : discoutRate;
  rentDays = isNaN(rentDays) ? 0 : rentDays;
  let price = servicePrice * rentDays * (1 - discoutRate / 100);
  let result = "<h2>Thông tin đặt phòng:</h2>";
  result += "<p>Họ và tên: " + fullName + "</p>";
  result += "<p>Số CMND: " + identityNumber + "</p>";
  result += "<p>Ngày sinh: " + birthDay + "</p>";
  result += "<p>E-mail: " + email + "</p>";
  result += "<p>Địa chỉ: " + address + "</p>";
  result += "<p>Hạng thành viên: " + customerType + "</p>";
  result += "<p>Giảm giá: " + discoutRate + "%</p>";
  result += "<p>Số lượng đi kèm: " + guestCount + "</p>";
  result += "<p>Số ngày thuê: " + rentDays + "</p>";
  result += "<p>Loại dịch vụ: " + serviceType + "</p>";
  result += "<p>Loại phòng: " + roomType + "</p>";
  result += "<h2>Tổng số tiền: " + price + "</h2>";
  document.write(result);
}
