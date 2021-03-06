package robocorp.robot.intellij;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * PSI = Program Structure Interface
 */
public class RobotPsiFile extends PsiFileBase {
    protected RobotPsiFile(@NotNull FileViewProvider viewProvider, @NotNull Language language) {
        super(viewProvider, language);
    }

    @Override
    public @NotNull FileType getFileType() {
        return RobotFrameworkFileType.INSTANCE;
    }

}
