package assignment01;

public class TVRemoteClassAdapter extends TV implements TVRemote {
    private int tvChannel = 2; // Initial channel set to 2

    public TVRemoteClassAdapter() {
        super(); // Call TV's constructor, which should also set its channel to an initial value (if such logic exists in TV)
        this.tvChannel = 2; // Ensure tvChannel is synchronized with TV's initial channel
        setChannel(this.tvChannel); // Align TV's channel state with tvChannel
    }

    @Override
    public void setChannel(int newChannel) {
        newChannel = Math.min(newChannel, MAX_CHANNELS);
        newChannel = Math.max(newChannel, 2);
        while (tvChannel != newChannel) {
            if (tvChannel < newChannel) {
                channelUp();
            } else {
                channelDown();
            }
        }
    }

    @Override
    public void channelUp() {
        if (tvChannel < MAX_CHANNELS) {
            super.up(); // Call TV's method to increase channel
            tvChannel++; // Synchronize tvChannel
        }
    }

    @Override
    public void channelDown() {
        if (tvChannel > 2) {
            super.down(); // Call TV's method to decrease channel
            tvChannel--; // Synchronize tvChannel
        }
    }

    @Override
    public void showChannel() {
        System.out.print("Remote Channel is " + tvChannel + ". ");
        super.showChannel(); // Show TV's channel for verification
    }
}
