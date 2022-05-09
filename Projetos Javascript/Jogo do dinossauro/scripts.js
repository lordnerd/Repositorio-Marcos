const wick = document.querySelector('.wick');
const background = document.querySelector('.background');

let isJumping = false;
let isGameOver = false;
let position = 0;

function handleKeyUp(event) {
  if (event.keyCode === 32) {
    if (!isJumping) {
      jump();
    }
  }
}

function jump() {
  isJumping = true;

  let upInterval = setInterval(() => {
    if (position >= 150) {
      // Descendo
      clearInterval(upInterval);

      let downInterval = setInterval(() => {
        if (position <= 0) {
          clearInterval(downInterval);
          isJumping = false;
        } else {
          position -= 20;
          wick.style.bottom = position + 'px';
        }
      }, 20);
    } else {
      // Subindo
      position += 20;
      wick.style.bottom = position + 'px';
    }
  }, 20);
}

function createGun() {
  const gun = document.createElement('div');
  let gunPosition = 1000;
  let randomTime = Math.random() * 6000;

  if (isGameOver) return;

  gun.classList.add('gun');
  background.appendChild(gun);
  gun.style.left = gunPosition + 'px';

  let leftTimer = setInterval(() => {
    if (gunPosition < -60) {
      // Saiu da tela
      clearInterval(leftTimer);
      background.removeChild(gun);
    } else if (gunPosition > 0 && gunPosition < 60 && position < 60) {
      // Game over
      clearInterval(leftTimer);
      isGameOver = true;
      document.body.innerHTML = '<h1 class="game-over">Fim de jogo</h1>';
    } else {
      gunPosition -= 10;
      gun.style.left = gunPosition + 'px';
    }
  }, 20);

  setTimeout(createGun, randomTime);
}

createGun();
document.addEventListener('keyup', handleKeyUp);


