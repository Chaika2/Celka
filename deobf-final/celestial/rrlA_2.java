package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrlA_2 {
   ;
   public static Object[] staticFields3851b9c979ec3bbaa39604ca840084aa;
   public Object[] fields3851b9c979ec3bbaa39604ca840084aa;
   private static byte[] bytes3851b9c979ec3bbaa39604ca840084aa;
   private static String[] strings3851b9c979ec3bbaa39604ca840084aa;
   private static boolean[] booleans3851b9c979ec3bbaa39604ca840084aa;
   private static short[] shorts3851b9c979ec3bbaa39604ca840084aa;

   private static void byte_() {
      strings3851b9c979ec3bbaa39604ca840084aa = new String[]{
         new String("CHESTS"),
         new String("BARRELS"),
         new String("DOORS"),
         new String("HOPPERS"),
         new String("BUTTONS"),
         new String("DISPENSERS"),
         new String("NOTE_BLOCKS"),
         new String("CRAFTING_TABLES"),
         new String("TRAP_DOORS"),
         new String("FURNACES"),
         new String("GATES"),
         new String("ANVILS"),
         new String("LEVERS")
      };
   }

   private rrlA_2(Class<? extends xd_3> var3, Supplier<Boolean> var4) {
      this.catch_();
      this.fields3851b9c979ec3bbaa39604ca840084aa[0] = var3;
      this.fields3851b9c979ec3bbaa39604ca840084aa[1] = var4;
   }

   static {
      ntfClinit();
   }

   public Supplier<Boolean> class_() {
      return (Supplier<Boolean>)this.fields3851b9c979ec3bbaa39604ca840084aa[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1463329331;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, 106, -19, 120, -81, 59, -56, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4742160851835830826L;
   }

   public Class<? extends xd_3> break_() {
      return (Class<? extends xd_3>)this.fields3851b9c979ec3bbaa39604ca840084aa[0];
   }

   private static void throws_() {
      shorts3851b9c979ec3bbaa39604ca840084aa = new short[]{13, 0, 1, 0, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }

   private void catch_() {
      if (this.fields3851b9c979ec3bbaa39604ca840084aa == null) {
         this.fields3851b9c979ec3bbaa39604ca840084aa = new Object[2];
      }
   }

   private static void case_() {
      bytes3851b9c979ec3bbaa39604ca840084aa = new byte[]{
         13,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         3,
         4,
         2,
         5,
         2,
         3,
         6,
         3,
         4,
         7,
         4,
         5,
         8,
         5,
         6,
         9,
         6,
         7,
         10,
         7,
         8,
         11,
         8,
         9,
         12,
         9,
         10,
         13,
         10,
         11,
         14,
         11,
         12,
         15,
         12,
         13,
         2,
         14
      };
   }

   private static void implements_() {
      Object[] var0 = new Object[]{
         new rrlA_2(JI.class, ((rrIk_1)NoInteract.byte_[3])::class_),
         new rrlA_2(xs_3.class, ((rrIk_1)NoInteract.byte_[4])::class_),
         new rrlA_2(dN_2.class, ((rrIk_1)NoInteract.byte_[5])::class_),
         new rrlA_2(kS_2.class, ((rrIk_1)NoInteract.byte_[6])::class_),
         new rrlA_2(Jt_1.class, ((rrIk_1)NoInteract.byte_[7])::class_),
         new rrlA_2(dQ_2.class, ((rrIk_1)NoInteract.byte_[8])::class_),
         new rrlA_2(kV_2.class, ((rrIk_1)NoInteract.byte_[9])::class_),
         new rrlA_2(dM_2.class, ((rrIk_1)NoInteract.byte_[10])::class_),
         new rrlA_2(zv_3.class, ((rrIk_1)NoInteract.byte_[11])::class_),
         new rrlA_2(JV.class, ((rrIk_1)NoInteract.byte_[12])::class_),
         new rrlA_2(dq_3.class, ((rrIk_1)NoInteract.byte_[13])::class_),
         new rrlA_2(Ji_1.class, ((rrIk_1)NoInteract.byte_[14])::class_),
         new rrlA_2(kL_2.class, ((rrIk_1)NoInteract.byte_[15])::class_),
         null
      };
      var0[13] = new rrlA_2[]{
         (rrlA_2)var0[0],
         (rrlA_2)var0[1],
         (rrlA_2)var0[2],
         (rrlA_2)var0[3],
         (rrlA_2)var0[4],
         (rrlA_2)var0[5],
         (rrlA_2)var0[6],
         (rrlA_2)var0[7],
         (rrlA_2)var0[8],
         (rrlA_2)var0[9],
         (rrlA_2)var0[10],
         (rrlA_2)var0[11],
         (rrlA_2)var0[12]
      };
      staticFields3851b9c979ec3bbaa39604ca840084aa = var0;
   }

   private static void private_() {
      booleans3851b9c979ec3bbaa39604ca840084aa = new boolean[]{false, true, false, false, true, true};
   }
}
