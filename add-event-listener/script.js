// 1. При нажатии на кнопку открытия устанавливаем ширину 250px
document.getElementById('openBtn').addEventListener('click', () => {
    document.getElementById('sideNav').style.width = '250px';
});

// 2. При нажатии на кнопку закрытия устанавливаем ширину обратно в 0px
document.getElementById('closeBtn').addEventListener('click', () => {
    document.getElementById('sideNav').style.width = '0px';
});
