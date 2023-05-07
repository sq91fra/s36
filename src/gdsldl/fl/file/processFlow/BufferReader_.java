package gdsldl.fl.file.processFlow;

public class BufferReader_ extends Reader_{
    private Reader_ reader_;

    public BufferReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    public void readFilePlus(int num){
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    public void readStringPlus(int num){
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
