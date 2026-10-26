/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rrbb_3;
import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class rrdw_1 {
    private int id_class = 0;
    private String id_break = null;
    private String[] id_byte = null;
    private String id_protected = null;
    private String[] id_throws = null;
    private int id_case = 0;

    public String id_byte() {
        return this.id_byte[this.id_case];
    }

    public rrdw_1(String string, String[] stringArray, String string2, String[] stringArray2, int n) {
        this.id_break = string;
        this.id_byte = stringArray;
        this.id_protected = string2;
        this.id_throws = stringArray2;
        this.id_class = n;
        if (stringArray.length != stringArray2.length) {
            throw new IllegalArgumentException("Property and user values have different lengths: " + stringArray.length + " != " + stringArray2.length);
        }
        if (n < 0 || n >= stringArray.length) {
            throw new IllegalArgumentException("Invalid default value: " + n);
        }
        this.id_case = n;
    }

    public String toString() {
        return this.id_break + "=" + this.id_byte() + " [" + rrbb_3.id_class(this.id_byte) + "], value: " + this.id_case;
    }

    public boolean id_class(String string) {
        if (string == null) {
            this.id_case = this.id_class;
            return false;
        }
        this.id_case = ArrayUtils.indexOf((Object[])this.id_byte, (Object)string);
        if (this.id_case >= 0 && this.id_case < this.id_byte.length) {
            return true;
        }
        this.id_case = this.id_class;
        return false;
    }

    public void id_class(boolean bl) {
        int n = 0;
        int n2 = this.id_byte.length - 1;
        this.id_case = rrbb_3.id_class(this.id_case, n, n2);
        if (bl) {
            ++this.id_case;
            if (this.id_case > n2) {
                this.id_case = n;
            }
        } else {
            --this.id_case;
            if (this.id_case < n) {
                this.id_case = n2;
            }
        }
    }

    public boolean id_class(Properties properties) {
        this.id_case();
        if (properties == null) {
            return false;
        }
        String string = properties.getProperty(this.id_break);
        return string == null ? false : this.id_class(string);
    }

    public void id_class(int n) {
        this.id_case = n;
        if (this.id_case < 0 || this.id_case >= this.id_byte.length) {
            this.id_case = this.id_class;
        }
    }

    public int id_class() {
        return this.id_case;
    }

    public void id_break(Properties properties) {
        if (properties != null) {
            properties.setProperty(this.id_throws(), this.id_byte());
        }
    }

    public String id_break() {
        return this.id_throws[this.id_case];
    }

    public String id_throws() {
        return this.id_break;
    }

    public void id_case() {
        this.id_case = this.id_class;
    }

    public String id_protected() {
        return this.id_protected;
    }
}

