/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.rjV_2;
import celestial.rrzX_2;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrWk_1 {
    private static FloatBuffer id_class = BufferUtils.createFloatBuffer((int)16);
    private static float[] id_break = new float[16];

    private static float[] id_class(float[] fArray) {
        float[] fArray2 = new float[16];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                fArray2[i * 4 + j] = fArray[j * 4 + i];
            }
        }
        return fArray2;
    }

    public static String id_class() {
        ((Buffer)id_class).clear();
        GL11.glGetFloatv((int)2982, (FloatBuffer)id_class);
        id_class.get(id_break);
        float[] fArray = rrWk_1.id_class(id_break);
        return rrWk_1.id_break(fArray);
    }

    public static String id_class(rjV_2 rjV_22) {
        rjV_22.id_class(id_break);
        return rrWk_1.id_break(id_break);
    }

    private static String id_break(float[] fArray) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < fArray.length; ++i) {
            String string = String.format("%.2f", Float.valueOf(fArray[i]));
            if (i > 0) {
                if (i % 4 == 0) {
                    stringBuffer.append("\n");
                } else {
                    stringBuffer.append(", ");
                }
            }
            string = rrzX_2.id_class(string, 5, ' ');
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public static String id_break() {
        ((Buffer)id_class).clear();
        GL11.glGetFloatv((int)2983, (FloatBuffer)id_class);
        id_class.get(id_break);
        float[] fArray = rrWk_1.id_class(id_break);
        return rrWk_1.id_break(fArray);
    }
}

