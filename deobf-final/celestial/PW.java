package celestial;

import java.awt.Color;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum PW implements Pk_1 {
   ;
   public Object[] fieldsc5fedc8899313727b7f3a8d711e7af0d;
   public static Object[] staticFieldsc5fedc8899313727b7f3a8d711e7af0d;
   private static short[] shortsc5fedc8899313727b7f3a8d711e7af0d;
   private static String[] stringsc5fedc8899313727b7f3a8d711e7af0d;
   private static byte[] bytesc5fedc8899313727b7f3a8d711e7af0d;
   private static boolean[] booleansc5fedc8899313727b7f3a8d711e7af0d;

   private static void byte_() {
      booleansc5fedc8899313727b7f3a8d711e7af0d = new boolean[]{true, false, false, true, false, true, false, true, false, false, true, true};
   }

   PW() {
      this.protected_();
      Object var7 = null;
      this.fieldsc5fedc8899313727b7f3a8d711e7af0d[0] = var7;
      Object var8 = null;
      this.fieldsc5fedc8899313727b7f3a8d711e7af0d[1] = var8;
      Object var9 = null;
      this.fieldsc5fedc8899313727b7f3a8d711e7af0d[2] = var9;
   }

   private <T> PW(Class<T> var3, Function<String, T> var4, Function<T, String> var5) {
      this.protected_();
      this.fieldsc5fedc8899313727b7f3a8d711e7af0d[0] = var3;
      Function var11 = var4::apply;
      this.fieldsc5fedc8899313727b7f3a8d711e7af0d[1] = var11;
      Function var12 = var1x -> (String)var5.apply(var1x);
      this.fieldsc5fedc8899313727b7f3a8d711e7af0d[2] = var12;
   }

   private <T> PW(Class<T> var3, Function<String, T> var4) {
      this(var3, var4, Object::toString);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8024230257828143058L;
   }

   @Override
   public String class_(PN var1, Object var2) {
      return (String)((Function)this.fieldsc5fedc8899313727b7f3a8d711e7af0d[2]).apply(var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1717471814;
   }

   private static void class_() {
      shortsc5fedc8899313727b7f3a8d711e7af0d = new short[]{13, 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }

   @Override
   public Object class_(PN var1, String var2) {
      Object var3 = ((Function)this.fieldsc5fedc8899313727b7f3a8d711e7af0d[1]).apply(var2);
      Objects.requireNonNull(var3);
      return var3;
   }

   @Override
   public boolean class_(Type var1) {
      return var1 instanceof Class && ((Class)this.fieldsc5fedc8899313727b7f3a8d711e7af0d[0]).isAssignableFrom((Class<?>)var1)
         ? true
         : booleansc5fedc8899313727b7f3a8d711e7af0d[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{9, -118, 38, -16, 47, -104, -20, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{
         new PW(Double.class, Double::parseDouble),
         new PW(Boolean.class, Boolean::parseBoolean),
         new PW(Integer.class, Integer::parseInt),
         new PW(Float.class, Float::parseFloat),
         new PW(Long.class, Long::parseLong),
         new PW(String.class, String::new),
         new PW(rpr_3.class, rpr_3::class_),
         new PW(
            Color.class,
            var0x -> new Color(Integer.parseInt(var0x.split(",")[0]), Integer.parseInt(var0x.split(",")[1]), Integer.parseInt(var0x.split(",")[2])),
            var0x -> var0x.getRed() + "," + var0x.getGreen() + "," + var0x.getBlue()
         ),
         new PW(
            rja_3.class,
            var0x -> new rja_3(Integer.parseInt(var0x.split(",")[0]), Integer.parseInt(var0x.split(",")[1]), Integer.parseInt(var0x.split(",")[2])),
            var0x -> var0x.b_() + "," + var0x.c_() + "," + var0x.d_()
         ),
         new PW(xd_3.class, var0x -> ri_3.break_(var0x.trim()), ri_3::class_),
         new PW(rdb_3.class, var0x -> rVL.for_.class_(new rqO_2(var0x.trim())), var0x -> rVL.for_.break_(var0x).toString()),
         new Pz_1(),
         new PQ(),
         null
      };
      var0[13] = new PW[]{
         (PW)var0[0], (PW)var0[1], (PW)var0[2], (PW)var0[3], (PW)var0[4], (PW)var0[5], (PW)var0[6], (PW)var0[7], (PW)var0[8], (PW)var0[9], (PW)var0[10]
      };
      staticFieldsc5fedc8899313727b7f3a8d711e7af0d = var0;
   }

   public static PW break_(Type var0) {
      return Stream.of(values()).filter(var1 -> var1.class_(var0)).findFirst().orElse(null);
   }

   private static void throws_() {
      bytesc5fedc8899313727b7f3a8d711e7af0d = new byte[]{
         2, 2, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 3, 14
      };
   }

   private static void catch_() {
      stringsc5fedc8899313727b7f3a8d711e7af0d = new String[]{
         new String(","),
         new String(","),
         new String(","),
         new String(","),
         new String(","),
         new String(","),
         new String("DOUBLE"),
         new String("BOOLEAN"),
         new String("INTEGER"),
         new String("FLOAT"),
         new String("LONG"),
         new String("STRING"),
         new String("DIRECTION"),
         new String("COLOR"),
         new String("VEC3I"),
         new String("BLOCK"),
         new String("ITEM"),
         new String("LIST"),
         new String("MAPPING")
      };
   }

   private void protected_() {
      if (this.fieldsc5fedc8899313727b7f3a8d711e7af0d == null) {
         this.fieldsc5fedc8899313727b7f3a8d711e7af0d = new Object[3];
         Object[] var1 = this.fieldsc5fedc8899313727b7f3a8d711e7af0d;
      }
   }
}
