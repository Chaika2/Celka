package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrnH_2 {
   ;
   private static boolean[] booleansba1a444f212636b2b8a611cbfb64503e;
   public static Object[] staticFieldsba1a444f212636b2b8a611cbfb64503e;
   private static short[] shortsba1a444f212636b2b8a611cbfb64503e;
   private static String[] stringsba1a444f212636b2b8a611cbfb64503e;
   private static byte[] bytesba1a444f212636b2b8a611cbfb64503e;
   public Object[] fieldsba1a444f212636b2b8a611cbfb64503e;

   public rLR byte_() {
      return (rLR)this.fieldsba1a444f212636b2b8a611cbfb64503e[0];
   }

   private rrnH_2(rLR var3, int var4, Supplier<Boolean> var5) {
      this.implements_();
      this.fieldsba1a444f212636b2b8a611cbfb64503e[0] = var3;
      Integer var11 = var4;
      this.fieldsba1a444f212636b2b8a611cbfb64503e[1] = var11;
      this.fieldsba1a444f212636b2b8a611cbfb64503e[2] = var5;
   }

   static {
      ntfClinit();
   }

   public int class_() {
      return (Integer)this.fieldsba1a444f212636b2b8a611cbfb64503e[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{116, 84, -4, 118, -5, 77, -68, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -687187525;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 481055095122020752L;
   }

   public Supplier<Boolean> break_() {
      return (Supplier<Boolean>)this.fieldsba1a444f212636b2b8a611cbfb64503e[2];
   }

   private static void throws_() {
      stringsba1a444f212636b2b8a611cbfb64503e = new String[]{new String("STRENGTH"), new String("SPEED"), new String("FIRE_RESISTANCE")};
   }

   private static void finally_() {
      shortsba1a444f212636b2b8a611cbfb64503e = new short[]{3, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void catch_() {
      booleansba1a444f212636b2b8a611cbfb64503e = new boolean[]{false, true, false, false, false, true, true, true, true, true, false};
   }

   private void implements_() {
      if (this.fieldsba1a444f212636b2b8a611cbfb64503e == null) {
         this.fieldsba1a444f212636b2b8a611cbfb64503e = new Object[3];
         this.fieldsba1a444f212636b2b8a611cbfb64503e[1] = 0;
      }
   }

   private static void protected_() {
      bytesba1a444f212636b2b8a611cbfb64503e = new byte[]{3, 2, 5, 2, 12, 2, 2, 3, 3, 4};
   }

   private static void private_() {
      Object[] var0 = new Object[]{
         new rrnH_2(rLD.throws_, 5, new rrIk_1("Силу", true)::class_),
         new rrnH_2(rLD.class_, 1, new rrIk_1("Скорость", true)::class_),
         new rrnH_2(rLD.native_, 12, new rrIk_1("Защиту от огня", true)::class_),
         null
      };
      var0[3] = new rrnH_2[]{(rrnH_2)var0[0], (rrnH_2)var0[1], (rrnH_2)var0[2]};
      staticFieldsba1a444f212636b2b8a611cbfb64503e = var0;
   }
}
