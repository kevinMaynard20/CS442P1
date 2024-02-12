package assignment01;

public class TVRemoteClassAdapter extends TV implements TVRemote {
    private int tvChannel = 2; // Initial channel set to 2

    public TVRemoteClassAdapter() {
        super(); 
        this.tvChannel = 2; 
        setChannel(this.tvChannel); 
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
            super.up(); 
            tvChannel++; 
        }
    }

    @Override
    public void channelDown() {
        if (tvChannel > 2) {
            super.down(); 
            tvChannel--; 
        }
    }

    @Override
    public void on() {
        super.on(); 
        
    }

    @Override
    public void off() {
        super.off(); // Turn the TV off
        
    }

    @Override
    public void showChannel() {
        System.out.print("Remote Channel is " + tvChannel + ". ");
        super.showChannel(); 
    }
}
