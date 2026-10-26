/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrWb_1 {
    private int id_class = 18;
    private int id_break = 128;
    private int id_byte = 18;
    private int id_protected = 0;
    private int id_throws = 0;
    private int id_case = 0;
    private byte[][][] id_catch = null;
    private byte[] id_private = null;
    private int id_implements = 0;

    public rrWb_1(int n, int n2, int n3) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_catch = new byte[n][n2][n3];
        this.id_class();
    }

    public void id_class(byte by) {
        try {
            this.id_private[this.id_implements] = by;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void id_class(int n, int n2, int n3) {
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = n3;
        this.id_class();
    }

    public void id_class() {
        for (int i = 0; i < this.id_class; ++i) {
            byte[][] byArray = this.id_catch[i];
            for (int j = 0; j < this.id_break; ++j) {
                byte[] byArray2 = byArray[j];
                for (int k = 0; k < this.id_byte; ++k) {
                    byArray2[k] = -1;
                }
            }
        }
    }

    public byte id_break(int n, int n2, int n3) {
        try {
            this.id_private = this.id_catch[n - this.id_protected][n2 - this.id_throws];
            this.id_implements = n3 - this.id_case;
            return this.id_private[this.id_implements];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            arrayIndexOutOfBoundsException.printStackTrace();
            return -1;
        }
    }
}

