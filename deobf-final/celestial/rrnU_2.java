package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record rrnU_2() implements Comparator<iB_2> {
   public AttackAura class_;
   private static short[] break_;
   private static String[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      throws_ = new boolean[]{true, false, true, false, false, true};
   }

   rrnU_2(AttackAura var1) {
      this.class_ = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7117211118422648148L;
   }

   public int class_(iB_2 var1, iB_2 var2) {
      if (this.class_.short_()) {
         return ComparisonChain.start()
            .compareTrueFirst(var1.class_(rXQ.CHEST).break_() == rdy_3.hz ? true : throws_[1], var2.class_(rXQ.CHEST).break_() == rdy_3.hz ? true : throws_[3])
            .compare(var2.while_((cb_3)MinecraftAccessor.import_.class_[57]), var1.while_((cb_3)MinecraftAccessor.import_.class_[57]))
            .compare(((cb_3)MinecraftAccessor.import_.class_[57]).protected_(var1), ((cb_3)MinecraftAccessor.import_.class_[57]).protected_(var2))
            .result();
      } else {
         String var3 = this.class_.interface_().byte_();

         return switch (var3) {
            case "Здоровье" -> Float.compare(var1.u_(), var2.u_());
            case "Дистанция" -> Double.compare(
            ((cb_3)MinecraftAccessor.import_.class_[57]).protected_(var1), ((cb_3)MinecraftAccessor.import_.class_[57]).protected_(var2)
         );
            case "Поле зрения" -> (int)(
            Math.abs(PJ.break_(var1) - (Float)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[15])
               - Math.abs(PJ.break_(var2) - (Float)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[15])
         );
            default -> ComparisonChain.start()
            .compare(var1.BN(), var2.BN())
            .compare(-var1.Bq(), -var2.Bq())
            .compare(var1.u_(), var2.u_())
            .compare(((cb_3)MinecraftAccessor.import_.class_[57]).protected_(var1), ((cb_3)MinecraftAccessor.import_.class_[57]).protected_(var2))
            .result();
         };
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 912319092;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -31, -90, 89, 23, -92, 121, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new byte[]{-1, 2};
   }

   private static void throws_() {
      byte_ = new String[]{new String("Здоровье"), new String("Дистанция"), new String("Поле зрения")};
   }

   private static void protected_() {
      break_ = new short[]{57, 57, 57, 57, 57, 57, 57, 15, 57, 15, 57, 57};
   }
}
