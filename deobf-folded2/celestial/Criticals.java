package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Criticals extends Module {
   private static float[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;

   public Criticals() {
      super("Criticals", "Позволяет всегда бить\nкритическами ударами", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new String[]{
         new String("Criticals"), new String("Позволяет всегда бить\nкритическами ударами"), new String("Необходимо использовать версию 1.17.1 или выше")
      };
   }

   @EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && !this.id_return()) {
         this.id_byte(false);
      }
   }

   @Override
   public void id_class(boolean var1) {
      if (!this.id_return()) {
         this.id_byte(false);
      } else {
         super.id_class(var1);
      }
   }

   @EventTarget
   public void id_class(rrFj_1 var1) {
      if (!((cb_3)id_import.id_class[57]).BL()) {
         float var2 = (Float)((cb_3)id_import.id_class[57]).id_throws[15] + rrfQ_2.id_byte(-0.0015F, 0.00105F);
         float var3 = (Float)((cb_3)id_import.id_class[57]).id_throws[16] + rrfQ_2.id_byte(-0.0015F, 0.00105F);
         double var4 = ((cb_3)id_import.id_class[57]).re() - (double)rrfQ_2.id_byte(3.5E-5F, 6.5E-5F);
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
            .id_break(new rZX(((cb_3)id_import.id_class[57]).rx(), var4, ((cb_3)id_import.id_class[57]).BO(), var2, var3, false));
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 75817713;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5623468838187463472L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, 118, -29, -41, -70, -38, -3, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_protected = new boolean[]{false, false, false, false, true, true, false};
   }

   private static void id_else() {
      id_byte = new short[]{0, 57, 57, 15, 57, 16, 57, 57, 0, 57, 57, 0, 0, 2000, 57, 57};
   }

   public boolean id_new() {
      return this.aJ_() && (cb_3)id_import.id_class[57] != null && !((cb_3)id_import.id_class[57]).BL() ? true : id_protected[6];
   }

   private boolean id_return() {
      if (rrjA_2.id_protected().id_throws().id_throws(ProtocolVersion.v1_17_1)) {
         String var1 = "Необходимо использовать версию 1.17.1 или выше";
         rrfu_3.id_byte(rrfu_3.id_class((Module)this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
         return false;
      } else {
         return id_protected[4];
      }
   }

   private static void id_super() {
      id_break = new float[]{-0.0015F, 0.00105F, -0.0015F, 0.00105F, 3.5E-5F, 6.5E-5F};
   }
}
