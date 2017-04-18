package ch02;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

	public TV(int channel, int volume, boolean power) {

		this.channel = channel;
		this.volume = volume;
		this.power = power;

	}

	public void status() {

		System.out.print("TV[채널: " + channel);
		System.out.print(", 볼륨: " + volume);
		System.out.println(", 전원: " + power + "]");

	}

	public void power(boolean on) {

		power = on;

	}

	public void volume(int voluem) {

		if (voluem > 0) {

			volume = volume + voluem;
			if (volume > 100) {

				volume = 100;
			}

		} else if (voluem < 0) {

			volume = volume - voluem;
			if (volume < 0) {

				volume = 0;
			}

		}

	}

	public void volume(boolean up) {

		if (up == true) {

			volume = volume + 1;
			if (volume > 100) {

				volume = 100;
			}

		} else if (up == false) {

			volume = volume - 1;
			if (volume < 0) {

				volume = 0;
			}

		}

	}

	public void channel(int channel) {

		if (channel == 0) {

			this.channel = 0;

		} else {
			this.channel = this.channel + channel;
			if (this.channel > 255) {

				this.channel = this.channel - 255;

			} else if (this.channel == 0) {

				this.channel = 255;
			} else if (this.channel < 0) {

				this.channel = 255 + this.channel;

			}
		}

	}

	public void channel(boolean up) {

		if (up == true) {

			this.channel = this.channel + 1;
			if (this.channel > 255) {

				this.channel = this.channel - 255;

			} else if (this.channel == 0) {

				this.channel = 255;
			}

		} else if (up == false) {

			this.channel = this.channel - 1;

			if (this.channel < 0) {

				this.channel = 255 + this.channel;

			} else if (this.channel == 0) {

				this.channel = 255;
			}

		}

	}

}
