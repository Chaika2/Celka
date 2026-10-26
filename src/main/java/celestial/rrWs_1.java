/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jZ_2;
import celestial.jv_3;
import celestial.lD_2;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class rrWs_1 {
    public static String id_class(IntBuffer intBuffer) {
        if (intBuffer == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(pos=" + intBuffer.position() + " lim=" + intBuffer.limit() + " cap=" + intBuffer.capacity() + ")");
        stringBuffer.append("[");
        int n = Math.min(intBuffer.limit(), 1024);
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(intBuffer.get(i));
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    private static String id_class(int n, lD_2 lD_22) {
        StringBuffer stringBuffer = new StringBuffer();
        ByteBuffer byteBuffer = lD_22.id_new();
        jZ_2 jZ_22 = lD_22.id_return();
        int n2 = lD_22.id_public() + n * jZ_22.id_break();
        for (jv_3 jv_32 : jZ_22.id_byte()) {
            if (jv_32.id_case() > 0) {
                stringBuffer.append("(");
            }
            for (int i = 0; i < jv_32.id_case(); ++i) {
                if (i > 0) {
                    stringBuffer.append(" ");
                }
                switch (jv_32.id_class()) {
                    case FLOAT: {
                        stringBuffer.append(byteBuffer.getFloat(n2));
                        break;
                    }
                    case UBYTE: 
                    case BYTE: {
                        stringBuffer.append(byteBuffer.get(n2));
                        break;
                    }
                    case USHORT: 
                    case SHORT: {
                        stringBuffer.append(byteBuffer.getShort(n2));
                        break;
                    }
                    case UINT: 
                    case INT: {
                        stringBuffer.append(byteBuffer.getShort(n2));
                        break;
                    }
                    default: {
                        stringBuffer.append("??");
                    }
                }
                n2 += jv_32.id_class().id_class();
            }
            if (jv_32.id_case() <= 0) continue;
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    public static String id_class(lD_2 lD_22) {
        int n = lD_22.id_package();
        String string = "";
        int n2 = -1;
        if (n == 7) {
            string = "quad";
            n2 = 4;
        } else {
            if (n != 4) {
                return "Invalid draw mode: " + n;
            }
            string = "triangle";
            n2 = 3;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = lD_22.id_int();
        for (int i = 0; i < n3; ++i) {
            if (i % n2 == 0) {
                stringBuffer.append(string + " " + i / n2 + "\n");
            }
            String string2 = rrWs_1.id_class(i, lD_22);
            stringBuffer.append(string2);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static int[] id_break(IntBuffer intBuffer) {
        int[] nArray = new int[intBuffer.limit()];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = intBuffer.get(i);
        }
        return nArray;
    }
}

