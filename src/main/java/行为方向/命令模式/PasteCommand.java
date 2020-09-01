package 行为方向.命令模式;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup(); //执行前先保存文字状态
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }

}
