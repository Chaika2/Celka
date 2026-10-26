package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruU implements rruT<rrqU_2>, rruq_1 {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   rruU(rrug_1 var1) {
      this.id_byte();
      this.id_class[id_protected[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, -126, 83, -117, 15, 59, 24, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rVe_1 id_class(rrqU_2 var1) {
      String var2 = var1.id_byte();
      rVe_1 var3 = new rVe_1(id_break[0]);
      var3.id_class(new rgN_2(id_break[1]).id_class(var3.id_class().id_class(rgF_2.RED)));
      rVe_1 var4 = new rVe_1(id_break[2]);
      var4.id_class(var4.id_class().id_class(rgF_2.GRAY));
      String var10001 = id_break[3];
      CharSequence[] var10002 = new CharSequence[1];
      var10002[id_byte[1]] = "Нажмите чтобы удалить '" + var2 + "' из списка блоков";
      var4.id_class(String.join(var10001, var10002));
      var3.id_class(var3.id_class().id_class(new rgy_3(rgp_3.id_class, var4)));
      rVe_1 var5 = rrfu_3.id_class((Object)var2).id_break();
      var5.id_class(var5.id_class().id_class(rgF_2.GRAY));
      var5.id_class(var3);
      var5.id_class(
         var5.id_class()
            .id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_protected[2]] + "blockesp remove " + var2))
      );
      return var5;
   }

   @Override
   public void id_class(C_static var1) {
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_protected[1]]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         rrug_1 var10000 = (rrug_1)this.id_class[id_protected[3]];
         rVi_1[] var10001 = new rVi_1[1];
         var10001[id_byte[3]] = var2;
         var10000.id_class(var10001);
      });
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -275726377;
   }

   private static void id_class() {
      id_byte = new boolean[]{true, false, true, false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2686667749901990291L;
   }

   private static void id_break() {
      id_protected = new short[4];
   }

   private static void id_protected() {
      id_break = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }
}
