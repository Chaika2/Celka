package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHB extends rrli_3 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_break = new boolean[]{
         true, false, false, true, true, true, true, false, false, false, false, true, false, true, false, true, false, true, false, false
      };
   }

   public rrHB(GuiMove var1) {
      super(var1);
      this.id_protected();
      ArrayList var6 = new ArrayList();
      this.id_class[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @EventTarget(
      id_class = -200
   )
   public void id_class(q_1 var1) {
      this.id_protected();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[1]]) {
         if ((Integer)this.id_class[2] > 0) {
            Integer var6 = (Integer)this.id_class[2] - 1;
            this.id_class[2] = var6;
         }

         if (rrfj_3.id_catch()) {
            Integer var7 = 3;
            this.id_class[2] = var7;
         }

         if ((Boolean)this.id_class[1]) {
            ((cb_3)id_import.id_class[57]).c_(id_break[1]);
            C_throws.id_byte().id_int().id_class();
            ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_break(id_break[2]);
         }

         if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            this.id_break();
         }
      } else if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]
         && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         this.id_break();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8314672339763072991L;
   }

   public boolean id_class() {
      this.id_protected();
      return !this.id_class[1] && ((List)this.id_class[id_protected[36]]).isEmpty() ? true : id_break[16];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1697101632;
   }

   @EventTarget
   public void id_class(rrLY var1) {
      this.id_protected();
      if (!((List)this.id_class[id_protected[15]]).isEmpty()) {
         Boolean var6 = true;
         this.id_class[1] = var6;
      }
   }

   private boolean id_class(rmt_3 var1) {
      this.id_protected();
      if (var1.id_break() != 0) {
         return id_break[9];
      } else if ((Integer)this.id_class[2] != 0 && !((cb_3)id_import.id_class[57]).Sy()) {
         return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               && var1.id_case().id_break() == rdy_3.Gu
               && var1.id_protected() == 1
            ? id_break[12]
            : true;
      } else {
         return id_break[10];
      }
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_protected();
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rmt_3 var3) {
         if (this.id_class(var3)) {
            ((List)this.id_class[id_protected[17]]).add(var3);
            var1.id_class(true);
         } else if (!((List)this.id_class[id_protected[18]]).isEmpty()) {
            this.id_case();
         }
      } else if (var2 instanceof rmj_3 && !((List)this.id_class[id_protected[19]]).isEmpty()) {
         Boolean var8 = true;
         this.id_class[1] = var8;
         var1.id_class(true);
      }
   }

   private void id_break() {
      this.id_protected();
      if ((Boolean)this.id_class[1] && !((cb_3)id_import.id_class[57]).X()) {
         this.id_case();
         Boolean var5 = id_break[14];
         this.id_class[1] = var5;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{90, 24, 95, 70, 18, 36, -104, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new short[]{0, 0, 2, 2, 2, 2, 1, 57, 57, 17, 1, 2, 1, 1, 2, 0, 1, 0, 0, 0, 1, 1, 2, 2, 57, 1, 2, 1, 57, 1, 0, 0, 57, 0, 0, 1, 0};
   }

   private void id_case() {
      this.id_protected();
      if (!((List)this.id_class[id_protected[30]]).isEmpty()) {
         for (rmt_3 var2 : (List)this.id_class[id_protected[31]]) {
            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_protected[33]]).id_break(var2);
         }

         ((List)this.id_class[id_protected[34]]).clear();
      }
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[1] = false;
         this.id_class[2] = 0;
      }
   }

   private static void id_private() {
      id_byte = new byte[]{3, 3, 2};
   }

   @Override
   public boolean aK_() {
      this.id_protected();
      this.id_case();
      Boolean var5 = id_break[7];
      this.id_class[1] = var5;
      Integer var6 = Integer.valueOf(id_break[8]);
      this.id_class[2] = var6;
      return super.aK_();
   }
}
