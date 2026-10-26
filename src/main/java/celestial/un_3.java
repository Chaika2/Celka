/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.fN_2;
import celestial.fc_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import celestial.uJ_2;
import celestial.uc_3;
import celestial.ul_3;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class un_3
implements uc_3 {
    public static final Logger id_class = LogManager.getLogger();
    private final rAL id_break;
    private final byte[] id_byte;
    private final String id_protected;
    private final Map<rqO_2, fN_2> id_throws = Maps.newHashMap();

    public un_3(rAL rAL2, byte[] byArray, String string) {
        this.id_break = rAL2;
        this.id_byte = byArray;
        this.id_protected = string;
        for (int i = 0; i < 256; ++i) {
            int n = i * 256;
            rqO_2 rqO_22 = this.id_break(n);
            try (rAF rAF2 = this.id_break.id_class(rqO_22);
                 fN_2 fN_22 = fN_2.id_class(fc_3.RGBA, rAF2.id_break());){
                if (fN_22.id_class() == 256 && fN_22.id_break() == 256) {
                    for (int j = 0; j < 256; ++j) {
                        byte by = byArray[n + j];
                        if (by == 0 || un_3.id_class(by) <= un_3.id_break(by)) continue;
                        byArray[n + j] = 0;
                    }
                    continue;
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            Arrays.fill(byArray, n, n + 256, (byte)0);
        }
    }

    private static int id_class(byte by) {
        return by >> 4 & 0xF;
    }

    @Override
    public IntSet id_class() {
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        for (int i = 0; i < 65535; ++i) {
            if (this.id_byte[i] == 0) continue;
            intOpenHashSet.add(i);
        }
        return intOpenHashSet;
    }

    private fN_2 id_class(rqO_2 rqO_22) {
        fN_2 fN_22;
        block8: {
            rAF rAF2 = this.id_break.id_class(rqO_22);
            try {
                fN_22 = fN_2.id_class(fc_3.RGBA, rAF2.id_break());
                if (rAF2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    id_class.error("Couldn't load texture {}", (Object)rqO_22, (Object)iOException);
                    return null;
                }
            }
            rAF2.close();
        }
        return fN_22;
    }

    @Override
    public uJ_2 id_class(int n) {
        if (n >= 0 && n <= 65535) {
            fN_2 fN_22;
            byte by = this.id_byte[n];
            if (by != 0 && (fN_22 = this.id_throws.computeIfAbsent(this.id_break(n), this::id_class)) != null) {
                int n2 = un_3.id_class(by);
                return new ul_3(n % 16 * 16 + n2, (n & 0xFF) / 16 * 16, un_3.id_break(by) - n2, 16, fN_22);
            }
            return null;
        }
        return null;
    }

    @Override
    public void close() {
        this.id_throws.values().forEach(fN_2::close);
    }

    private static int id_break(byte by) {
        return (by & 0xF) + 1;
    }

    private rqO_2 id_break(int n) {
        rqO_2 rqO_22 = new rqO_2(String.format(this.id_protected, String.format("%02x", n / 256)));
        return new rqO_2(rqO_22.id_byte(), "textures/" + rqO_22.id_break());
    }
}

