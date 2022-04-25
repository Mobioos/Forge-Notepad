import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.undo.CannotUndoException;

class UndoAction extends AbstractAction {

    private static final long serialVersionUID = 1;

    Notepad notepad;

    public UndoAction(Notepad notepad) {
        super("Undo");
        putValue(Action.SMALL_ICON,
                new ImageIcon(this.getClass().getResource("images/undo.png")));
        setEnabled(false);
        this.notepad = notepad;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            notepad.undo.undo();
        } catch (CannotUndoException ex) {
            System.out.println("Unable to undo: " + ex);
            ex.printStackTrace();
        }
        update();
        
    }

    protected void update() {
        if (notepad.undo.canUndo()) {
            setEnabled(true);
            putValue("Undo", notepad.undo.getUndoPresentationName());
        } else {
            setEnabled(false);
            putValue(Action.NAME, "Undo");
        }
    }

}

