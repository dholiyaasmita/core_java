package april20.encapsulation;

public class EditorMain {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Introduction","text","Hello my name is Asmita," +
                "I am Learning JAVA.");

        System.out.println(textEditor.toString());
        System.out.println("after changing file content");

        textEditor.setFileContent("haa haa haa");
        System.out.println(textEditor.toString());


        PragraEditor pragraEditor = new PragraEditor("Study material for GIT","pdf","Attending Java class here.");
        System.out.println("the pragra file content: "+ pragraEditor.getFileContent());


    }
}
