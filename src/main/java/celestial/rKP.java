/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.rKB;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;

public class rKP {
    private static final Int2ObjectMap<rKP> id_protected = new Int2ObjectOpenHashMap();
    public static final rKP id_class = rKP.id_class(new rKP(1, GZIPInputStream::new, GZIPOutputStream::new));
    public static final rKP id_break = rKP.id_class(new rKP(2, InflaterInputStream::new, DeflaterOutputStream::new));
    public static final rKP id_byte = rKP.id_class(new rKP(3, inputStream -> inputStream, outputStream -> outputStream));
    private final int id_throws;
    private final rKB<InputStream> id_case;
    private final rKB<OutputStream> id_catch;

    private rKP(int n, rKB<InputStream> rKB2, rKB<OutputStream> rKB3) {
        this.id_throws = n;
        this.id_case = rKB2;
        this.id_catch = rKB3;
    }

    public OutputStream id_class(OutputStream outputStream) throws IOException {
        return this.id_catch.wrap(outputStream);
    }

    public InputStream id_class(InputStream inputStream) throws IOException {
        return this.id_case.wrap(inputStream);
    }

    private static rKP id_class(rKP rKP2) {
        id_protected.put(rKP2.id_throws, (Object)rKP2);
        return rKP2;
    }

    public static rKP id_class(int n) {
        return (rKP)id_protected.get(n);
    }

    public int id_class() {
        return this.id_throws;
    }

    public static boolean id_break(int n) {
        return id_protected.containsKey(n);
    }
}

