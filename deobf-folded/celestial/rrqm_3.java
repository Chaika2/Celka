package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqm_3 extends rrqk_3 {
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_int() {
      id_protected = new boolean[2];
   }

   public rrqm_3(XRay<?> var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvj_3 var3) {
         xd_3 var4 = var3.id_break().id_break();
         rfH_2 var5 = var3.id_byte();

         for (rrqz_3 var7 : ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_byte[3]]).id_break()) {
            if (var7.id_byte() == var4) {
               this.id_class(new rrqc_3(new rrqz_3(var4, ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_byte[4]]).id_class(var4)), var5, var5));
               break;
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5893049719233734085L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1354853200;
   }

   @Override
   public void id_class(q_1 var1) {
      super.id_class(var1);
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]]) {
         XRay var2 = this.id_continue();
         if (!var2.id_continue()) {
            return;
         }

         List var3 = this.id_extends();
         float var4 = this.id_continue().id_new().id_byte();

         for (int var5 = id_protected[0]; (float)var5 < var4 && !var3.isEmpty(); var5++) {
            rja_3 var6 = (rja_3)var3.remove(id_protected[1]);
            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_byte[2]]).id_break(new rZb_1(rZM.STOP_DESTROY_BLOCK, new rfH_2(var6), rpr_3.UP));
            this.id_class(var6);
            this.id_class();
         }
      }
   }

   private static void id_new() {
      id_byte = new short[]{0, 57, 0, 0, 0};
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -53, -65, 69, -12, -54, 37, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
