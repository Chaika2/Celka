/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.io.File;
import java.io.FileNotFoundException;

public class rAy_1
extends FileNotFoundException {
    public rAy_1(File file, String string) {
        super(String.format("'%s' in ResourcePack '%s'", string, file));
    }
}

