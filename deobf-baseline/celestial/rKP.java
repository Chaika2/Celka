package celestial;

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
   public static final rKP id_class = id_class(new rKP(1, GZIPInputStream::new, GZIPOutputStream::new));
   public static final rKP id_break = id_class(new rKP(2, InflaterInputStream::new, DeflaterOutputStream::new));
   public static final rKP id_byte = id_class(new rKP(3, var0 -> var0, var0 -> var0));
   private final int id_throws;
   private final rKB<InputStream> id_case;
   private final rKB<OutputStream> id_catch;

   private rKP(int var1, rKB<InputStream> var2, rKB<OutputStream> var3) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_catch = var3;
   }

   public OutputStream id_class(OutputStream var1) throws IOException {
      return this.id_catch.wrap(var1);
   }

   public InputStream id_class(InputStream var1) throws IOException {
      return this.id_case.wrap(var1);
   }

   private static rKP id_class(rKP var0) {
      id_protected.put(var0.id_throws, var0);
      return var0;
   }

   public static rKP id_class(int var0) {
      return (rKP)id_protected.get(var0);
   }

   public int id_class() {
      return this.id_throws;
   }

   public static boolean id_break(int var0) {
      return id_protected.containsKey(var0);
   }
}
