/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqu_3;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rpz_3 {
    private static final Pattern id_class = Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", 66);
    private static final Pattern id_break = Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", 2);

    public static boolean id_class(Path path) {
        Path path2 = path.normalize();
        return path2.equals(path);
    }

    public static String id_class(Path path, String object, String string) throws IOException {
        for (char c : rqu_3.id_protected) {
            object = ((String)object).replace(c, '_');
        }
        if (id_break.matcher((CharSequence)(object = ((String)object).replaceAll("[./\"]", "_"))).matches()) {
            object = "_" + (String)object + "_";
        }
        Object object2 = id_class.matcher((CharSequence)object);
        int n = 0;
        if (((Matcher)object2).matches()) {
            object = ((Matcher)object2).group("name");
            n = Integer.parseInt(((Matcher)object2).group("count"));
        }
        if (((String)object).length() > 255 - string.length()) {
            object = ((String)object).substring(0, 255 - string.length());
        }
        while (true) {
            Object object3;
            Object object4 = object;
            if (n != 0) {
                object3 = " (" + n + ")";
                int n2 = 255 - ((String)object3).length();
                if (((String)object).length() > n2) {
                    object4 = ((String)object).substring(0, n2);
                }
                object4 = (String)object4 + (String)object3;
            }
            object4 = (String)object4 + string;
            object3 = path.resolve((String)object4);
            try {
                Path path2 = Files.createDirectory((Path)object3, new FileAttribute[0]);
                Files.deleteIfExists(path2);
                return path.relativize(path2).toString();
            }
            catch (FileAlreadyExistsException fileAlreadyExistsException) {
                ++n;
                continue;
            }
            break;
        }
    }

    public static boolean id_break(Path path) {
        for (Path path2 : path) {
            if (!id_break.matcher(path2.toString()).matches()) continue;
            return false;
        }
        return true;
    }

    public static Path id_break(Path path, String string, String string2) {
        String string3 = string + string2;
        Path path2 = Paths.get(string3, new String[0]);
        if (path2.endsWith(string2)) {
            throw new InvalidPathException(string3, "empty resource name");
        }
        return path.resolve(path2);
    }
}

