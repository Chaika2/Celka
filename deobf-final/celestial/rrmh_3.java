package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmh_3 extends C_try {
   private static short[] break_;
   private static String[] throws_;
   private static byte[] case_;
   private static boolean[] catch_;

   public rrmh_3(C_case var1) {
      super(var1, "cleaninv");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1653639930781242178L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 7557732;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      for (int var3 = 0; var3 < 36; var3++) {
         rdn_3 var4 = ((rhz_3)((cb_3)b_.class_[57]).implements_[1]).extends_(var3);
         if (!var4.class_()) {
            ((Ax_1)b_.class_[55]).class_(0, rrfY_2.break_(var3), 45, rXa_1.SWAP, true);
         }
      }

      if (!((rhz_3)((cb_3)b_.class_[57]).implements_[1]).break_.get(0).class_()) {
         ((Ax_1)b_.class_[55]).class_(0, 8, 45, rXa_1.SWAP, true);
      }

      if (!((rhz_3)((cb_3)b_.class_[57]).implements_[1]).break_.get(1).class_()) {
         ((Ax_1)b_.class_[55]).class_(0, 7, 45, rXa_1.SWAP, true);
      }

      if (!((rhz_3)((cb_3)b_.class_[57]).implements_[1]).break_.get(2).class_()) {
         ((Ax_1)b_.class_[55]).class_(0, 6, 45, rXa_1.SWAP, true);
      }

      if (!((rhz_3)((cb_3)b_.class_[57]).implements_[1]).break_.get(3).class_()) {
         ((Ax_1)b_.class_[55]).class_(0, 5, 45, rXa_1.SWAP, true);
      }

      if (!((cb_3)b_.class_[57]).Sn().class_()) {
         ((Ax_1)b_.class_[55]).class_(0, 45, 45, rXa_1.SWAP, true);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-5, -4, 2, -96, 46, 2, 107, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new String[]{new String("cleaninv"), new String("Команда для очистки инвентаря"), new String("> %s%s")};
   }

   private static void finally_() {
      catch_ = new boolean[]{true, false, false, false, true, false, false, true, true, false, true, false, true, false, true, false, true, false, false, true};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of("> %s%s".formatted(var2, var1));
   }

   private static void extends_() {
      break_ = new short[]{57, 1, 55, 57, 1, 55, 57, 1, 55, 57, 1, 55, 57, 1, 55, 57, 55, 0, 0};
   }

   @Override
   public String implements_() {
      return "Команда для очистки инвентаря";
   }

   private static void protected_() {
      case_ = new byte[]{36, 45, 8, 45, 7, 45, 2, 6, 45, 3, 5, 45, 45, 45, 2};
   }
}
