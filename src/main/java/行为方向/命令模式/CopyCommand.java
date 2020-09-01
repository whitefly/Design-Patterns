package 行为方向.命令模式;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText(); //将选中的文字,设置到剪切板
        return false;
    }

}
