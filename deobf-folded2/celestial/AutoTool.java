package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoTool extends Module {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static short[] id_catch;
   private static float[] id_private;

   public AutoTool() {
      super("Auto Tool", "Автоматически берет лучший\nинструмент для ломания блока", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_else();
      Integer var5 = -1;
      this.id_break[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new short[]{3, 0, 0, 57, 0, 57, 1, 0, 57, 1, 57, 1, 0, 57, 1, 1, 0, 57, 1, 0, 0, 57, 1, 56, 57, 57, 56, 0};
   }

   @EventTarget
   public void id_class(rrLH var1) {
      this.id_else();
      if (var1.id_protected() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0]) {
         if (var1.id_byte() || ((cb_3)id_import.id_class[57]).id_native()) {
            return;
         }

         if ((Integer)this.id_break[0] != -1) {
            ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_break[0];
         }

         Pair var2 = this.id_class(var1.id_class(), var1.id_break());
         if (var2 == null) {
            return;
         }

         int var3 = (Integer)var2.getRight();
         if (var3 == -1 || var3 == ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected) {
            return;
         }

         Integer var8 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected;
         this.id_break[0] = var8;
         ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = var3;
      } else if (var1.id_protected() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1] && (Integer)this.id_break[0] != -1) {
         ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_break[0];
         Integer var9 = -1;
         this.id_break[0] = var9;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2408093434591521583L;
   }

   public Pair<rdn_3, Integer> id_class(xc_3 var1, rfH_2 var2) {
      rdn_3 var3 = rdn_3.id_break;
      int var4 = -1;
      float var5 = 0.0F;

      for (int var6 = 0; var6 < 9; var6++) {
         rdn_3 var7 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_class.get(var6);
         if (!var7.id_class() && var7.id_break().id_class(var1, (gm_3)id_import.id_class[56], var2, (cb_3)id_import.id_class[57])) {
            float var8 = var1.id_class((cb_3)id_import.id_class[57], var7, (gm_3)id_import.id_class[56], var2);
            if (!(var8 <= 0.0F) && var8 > var5) {
               var5 = var8;
               var4 = var6;
               var3 = var7;
            }
         }
      }

      return Pair.of(var3, var4);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -96290820;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, -111, -54, 44, -109, 14, -24, 60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_else();
      super.id_throws(var1);
      Integer var6 = -1;
      this.id_break[0] = var6;
   }

   private static void id_continue() {
      id_byte = new boolean[]{false, true, false, false};
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         this.id_break[0] = 0;
      }
   }

   private static void id_new() {
      id_private = new float[2];
   }

   private static void id_return() {
      id_protected = new String[]{new String("Auto Tool"), new String("Автоматически берет лучший\nинструмент для ломания блока")};
   }

   private static void id_super() {
      id_throws = new byte[]{-1, -1, -1, -1, -1, -1, 9, -1};
   }
}
