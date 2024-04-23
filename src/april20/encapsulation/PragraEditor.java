package april20.encapsulation;

public class PragraEditor {

    private String fileName;
    private String fileType;

    private String fileContent;

    public PragraEditor(String fileName, String fileType, String fileContent) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileContent = fileContent;
    }

    public String getFileContent() {
        return fileContent;
    }
}
