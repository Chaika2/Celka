package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCz_1 extends rrCk_1 {
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_case;
   public Object[] id_break;

   @Override
   public void id_byte() {
      rdn_3 var1 = ((cb_3)id_import.id_class[57]).Sn();
      if (!this.id_continue().id_continue()) {
         Pair var2 = this.id_continue().id_this();
         int var3 = (Integer)var2.getRight();
         if (var3 >= 0) {
            var3 = rrfY_2.id_break(var3);
            if (!var1.id_class()) {
               ((rrmi_3)this.id_class[1]).id_class(var1, var3);
            }

            ((Ax_1)id_import.id_class[55]).id_class(((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case, var3, 40, rXa_1.SWAP, id_case[0]);
            Boolean var8 = true;
            this.id_class[id_byte[6]] = var8;
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(rrLY.id_class());
         }
      }
   }

   public rrCz_1(AutoTotem var1) {
      super(var1);
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -893705568;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]]) {
         if (this.id_continue().id_super()) {
            this.id_byte();
         } else {
            this.id_class();
         }
      }
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_throws();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8797402902491132945L;
   }

   @Override
   public void id_class() {
      this.id_implements();
      if ((Boolean)this.id_class[id_byte[8]] && ((rrmi_3)this.id_class[1]).id_class()) {
         int var10002 = (Integer)this.id_break[id_byte[10]] + 1;
         Integer var6 = var10002;
         this.id_break[id_byte[11]] = var6;
         if (var10002 > 1) {
            int var1 = ((rrmi_3)this.id_class[1]).id_class(true);
            if (var1 < 0) {
               return;
            }

            ((Ax_1)id_import.id_class[55]).id_class(((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case, var1, 40, rXa_1.SWAP, id_case[6]);
            this.id_throws();
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[16]]).id_finally().id_class(rrLY.id_class());
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, 108, -37, 119, -16, -31, -16, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_throws() {
      this.id_implements();
      ((rrmi_3)this.id_class[1]).id_throws();
      Boolean var5 = id_case[7];
      this.id_class[id_byte[18]] = var5;
      Integer var6 = Integer.valueOf(id_case[8]);
      this.id_break[id_byte[19]] = var6;
   }

   private static void id_finally() {
      id_byte = new short[]{0, 57, 1, 55, 57, 4, 0, 0, 0, 1, 0, 0, 1, 55, 57, 4, 0, 1, 0, 0};
   }

   private static void id_case() {
      id_case = new boolean[]{false, true, true, true, true, false, false, false, false, true, false, false};
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         this.id_break[0] = 0;
      }
   }

   private static void id_private() {
      id_protected = new byte[]{40, 40};
   }

   @Override
   public boolean aK_() {
      this.id_throws();
      return super.aK_();
   }
}
