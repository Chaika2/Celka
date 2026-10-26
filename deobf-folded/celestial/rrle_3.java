package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrle_3 extends rrTF<FreeCamera> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_byte = new short[]{73, 57, 18, 73, 57, 57, 0, 57, 0, 57, 0};
   }

   public rrle_3(FreeCamera var1) {
      super(var1);
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_break = new boolean[]{true, true};
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rFP) {
         if ((vm_3)id_import.id_class[73] instanceof Zb_1) {
            return;
         }

         this.id_continue().aw_();
      }
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      FreeCamera var2 = this.id_continue();
      if (var2.id_continue()) {
         if (!((vm_3)id_import.id_class[73] instanceof Zb_1)) {
            rrlU_2 var3 = var2.id_new();
            if (!var3.id_protected() && !((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
               var1.id_class(true);
            } else {
               var1.id_class(var3.id_throws());
               var1.id_byte(var3.id_case());
               var1.id_byte(var3.id_break());
               var1.id_protected(var3.id_byte());
               var1.id_break(var3.id_class());
               var1.id_break(var3.id_protected());
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1283178436;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8967797363433077248L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -58, 48, 122, 80, -109, -121, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   @Override
   public boolean aI_() {
      this.id_break();
      if ((cb_3)id_import.id_class[57] != null) {
         rjU_2 var5 = ((cb_3)id_import.id_class[57]).rv();
         this.id_class[id_byte[6]] = var5;
      }

      return super.aI_();
   }

   @Override
   public boolean aK_() {
      this.id_break();
      if ((cb_3)id_import.id_class[57] != null && (rjU_2)this.id_class[id_byte[8]] != null && this.id_continue().id_continue()) {
         ((cb_3)id_import.id_class[57]).id_byte((rjU_2)this.id_class[id_byte[10]]);
      }

      return super.aK_();
   }
}
