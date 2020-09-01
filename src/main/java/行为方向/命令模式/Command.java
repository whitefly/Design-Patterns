package 行为方向.命令模式;

public abstract class Command {
    public Editor editor;
    private String backup; //每一个命令指向前的状态

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();

}
