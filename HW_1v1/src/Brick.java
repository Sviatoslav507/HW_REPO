public class Brick {
    private double bLength;
    private double bWidth;

    private double bHeigh;
    private double hLength;
    private double hHeight;
// Для інкапсуляції використав "Сеттери" та "Геттери", але геттери в коді не використовую.
    public void setbHeigh(double bHeigh) {this.bHeigh = bHeigh;}
    public double getbHeigh() {return bHeigh;}
    public void setbLength(double bLength) {this.bLength = bLength;}
    public double getbLength() {return bLength;}
    public double getbWidth() {return bWidth;}
    public void setbWidth(double bWidth) {this.bWidth = bWidth;}
    public void sethHeight(double hHeight) {this.hHeight = hHeight;}
    public double gethHeight() {return hHeight;}
    public void sethLength(double hLength) { this.hLength = hLength;}
    public double gethLength() { return hLength;}
//Методи які порівнюють сторони цеглини зі сторонами отвору.
    public boolean CheckA(Brick brk){
    if(brk.bLength <= hLength & brk.bHeigh <= hHeight){
        return true;
    }else return false;
    }
    public boolean CheckB(Brick brk){
        if(brk.bWidth <= hLength & brk.bHeigh <= hHeight){
            return true;
        }else return false;
    }
}

