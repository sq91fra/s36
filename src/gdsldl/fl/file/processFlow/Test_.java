package gdsldl.fl.file.processFlow;

public class Test_ {
    public static void main(String[] args) {
//        通过包装流封装节点流
        BufferReader_ file = new BufferReader_(new FileReader_());
        file.readFilePlus(10);

        BufferReader_ string = new BufferReader_(new StringReader_());
        string.readStringPlus(10);

    }
}
