class TV {
  constructor(channel, volumeLevel, status) {
    this.channel = 1 || channel;
    this.volumeLevel = 5 || volumeLevel;
    this.status = (status == undefined ? false : status);
  }

  getChannel() {
    return this.channel;
  }

  getVolumeLevel() {
    return this.volumeLevel;
  }

  getStatus() {
    return this.status;
  }

  setChannel(channel) {
    this.channel = channel;
    console.log(`Current channel: ${this.channel}`);
  }

  volumeUp() {
    this.volumeLevel++;
    console.log(`Current volume level: ${this.volumeLevel}`);
  }

  volumeDown() {
    this.volumeLevel--;
    console.log(`Current volume level: ${this.volumeLevel}`);
  }

  switchOff() {
    this.status = false;
    console.log('TV has turned off!');
  }

  switchOn() {
    this.status = true;
    console.log('TV has turned on!');
  }
}

class Remote {
  constructor(tv) {
    this.tv = tv;
  }

  changeChannel(channel) {
    this.tv.setChannel(channel);
  }

  volumeUp() {
    this.tv.volumeUp();
  }

  volumeDown() {
    this.tv.volumeDown();
  }

  switchOff() {
    this.tv.status = false;
  }

  switchOn() {
    this.tv.status = true;
  }
}

function demo() {
  const tv = new TV();
  const remote = new Remote(tv);
  console.table(tv);
  remote.switchOn();
  remote.changeChannel(7);
  remote.changeChannel(3);
  remote.volumeUp();
  remote.volumeUp();
  remote.switchOff();
}

demo();
