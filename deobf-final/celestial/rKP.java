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
   private static final Int2ObjectMap<rKP> protected_ = new Int2ObjectOpenHashMap();
   public static final rKP class_ = class_(new rKP(1, GZIPInputStream::new, GZIPOutputStream::new));
   public static final rKP break_ = class_(new rKP(2, InflaterInputStream::new, DeflaterOutputStream::new));
   public static final rKP byte_ = class_(new rKP(3, var0 -> var0, var0 -> var0));
   private final int throws_;
   private final rKB<InputStream> case_;
   private final rKB<OutputStream> catch_;

   private rKP(int var1, rKB<InputStream> var2, rKB<OutputStream> var3) {
      this.throws_ = var1;
      this.case_ = var2;
      this.catch_ = var3;
   }

   public OutputStream class_(OutputStream var1) throws IOException {
      return this.catch_.wrap(var1);
   }

   public InputStream class_(InputStream var1) throws IOException {
      return this.case_.wrap(var1);
   }

   private static rKP class_(rKP var0) {
      protected_.put(var0.throws_, var0);
      return var0;
   }

   public static rKP class_(int var0) {
      return (rKP)protected_.get(var0);
   }

   public int class_() {
      return this.throws_;
   }

   public static boolean break_(int var0) {
      return protected_.containsKey(var0);
   }
}
