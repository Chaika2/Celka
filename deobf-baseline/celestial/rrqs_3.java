package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqs_3 implements MinecraftAccessor {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   public rrqS_2 id_byte() {
      return (rrqS_2)this.id_class[id_protected[17]];
   }

   public rrqs_3(rrqP_2 var1) {
      this.id_catch();
      this.id_class[id_protected[0]] = var1;
      rrqS_2 var7 = (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[1]];
      this.id_class[id_protected[2]] = var7;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1666136283;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 51, 7, -124, -30, -123, 11, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4634430409592827815L;
   }

   public rrqS_2 id_class() {
      String var1 = ((rrqP_2)this.id_class[id_protected[8]]).id_class().id_class().getName();
      Aw_1 var2 = rrfp_3.id_class(var1);
      rhd_3 var3 = ((gm_3)id_import.id_class[id_protected[9]]).id_break(var1);
      if (this.id_class((rrqP_2)this.id_class[id_protected[10]])) {
         return (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[11]];
      } else if (var2 == null) {
         return (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[12]];
      } else if (var2.id_break() == rRl_1.SPECTATOR) {
         return (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[13]];
      } else {
         return var3 != null && !var3.sc()
            ? (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[14]]
            : (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[15]];
      }
   }

   public boolean id_class(rrqP_2 var1) {
      return var1.id_class().id_implements() == null ? id_byte[0] : id_byte[1];
   }

   public rrqP_2 id_break() {
      return (rrqP_2)this.id_class[id_protected[16]];
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   private static void id_case() {
      id_break = new byte[]{2};
   }

   public void id_protected() {
      rrqS_2 var1 = this.id_class();
      if (var1 != (rrqS_2)this.id_class[id_protected[3]]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[4]])
            .id_finally()
            .id_class(rrFV.id_class((rrqP_2)this.id_class[id_protected[5]], (rrqS_2)this.id_class[id_protected[6]], var1));
         this.id_class[id_protected[7]] = var1;
      }
   }

   private static void id_private() {
      id_protected = new short[]{0, 5, 1, 1, 0, 0, 1, 1, 0, 56, 0, 4, 1, 3, 2, 0, 0, 1};
   }
}
