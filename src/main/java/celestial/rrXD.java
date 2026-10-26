/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXK;
import celestial.rrXU;
import celestial.rrXo_1;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;

public class rrXD {
    public static rrXK[] id_class(String string) throws IOException, rrXo_1 {
        StringReader stringReader = new StringReader(string);
        PushbackReader pushbackReader = new PushbackReader(stringReader);
        ArrayList<rrXK> arrayList = new ArrayList<rrXK>();
        while (true) {
            int n;
            if ((n = pushbackReader.read()) < 0) {
                rrXK[] rrXKArray = arrayList.toArray(new rrXK[arrayList.size()]);
                return rrXKArray;
            }
            char c = (char)n;
            if (Character.isWhitespace(c)) continue;
            rrXU rrXU2 = rrXU.id_class(c);
            if (rrXU2 == null) {
                throw new rrXo_1("Invalid character: '" + c + "', in: " + string);
            }
            rrXK rrXK2 = rrXD.id_class(c, rrXU2, pushbackReader);
            arrayList.add(rrXK2);
        }
    }

    private static rrXK id_class(char c, rrXU rrXU2, PushbackReader pushbackReader) throws IOException {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c);
        while ((n = pushbackReader.read()) >= 0) {
            char c2 = (char)n;
            if (!rrXU2.id_break(c2)) {
                pushbackReader.unread(c2);
                break;
            }
            stringBuffer.append(c2);
        }
        return new rrXK(rrXU2, stringBuffer.toString());
    }
}

