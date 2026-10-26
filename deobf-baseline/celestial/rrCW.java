package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCW extends rrCk_1 {
   private static byte[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static long[] id_case;
   private static boolean[] id_catch;

   @Override
   public void id_byte() {
      this.id_private();
      if ((Integer)this.id_break[id_protected[8]] == id_byte[1]) {
         Pair var1 = this.id_continue().id_this();
         int var2 = (Integer)var1.getRight();
         if (var2 >= 0) {
            boolean var3 = ((cb_3)id_import.id_class[id_protected[9]]).Sn().id_public();
            int var4 = ((rhz_3)((cb_3)id_import.id_class[id_protected[10]]).id_implements[id_protected[11]]).id_case();
            if (var2 > id_byte[2]) {
               ((rrfP_2)this.id_break[id_protected[12]])
                  .id_class(((rhz_3)((cb_3)id_import.id_class[id_protected[13]]).id_implements[id_protected[14]]).id_protected);
               Long var9 = System.currentTimeMillis();
               this.id_break[id_protected[15]] = var9;
               ((Ax_1)id_import.id_class[id_protected[16]]).id_break(var2);
               ((Aq_1)((cb_3)id_import.id_class[id_protected[17]]).id_break[id_protected[18]])
                  .id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
               ((Ax_1)id_import.id_class[id_protected[19]]).id_break(var2);
               if (var3 || ((rhz_3)((cb_3)id_import.id_class[id_protected[20]]).id_implements[id_protected[21]]).id_extends(var4).id_class()) {
                  Integer var10 = var4;
                  this.id_break[id_protected[22]] = var10;
                  return;
               }
            } else {
               ((Aq_1)((cb_3)id_import.id_class[id_protected[23]]).id_break[id_protected[24]]).id_break(new rme_3(var2));
               ((Aq_1)((cb_3)id_import.id_class[id_protected[25]]).id_break[id_protected[26]])
                  .id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
               ((Aq_1)((cb_3)id_import.id_class[id_protected[27]]).id_break[id_protected[28]])
                  .id_break(new rme_3(((rhz_3)((cb_3)id_import.id_class[id_protected[29]]).id_implements[id_protected[30]]).id_protected));
            }

            if ((Integer)this.id_break[id_protected[31]] == id_byte[3]) {
               Integer var11 = var2;
               this.id_break[id_protected[32]] = var11;
               Boolean var12 = id_catch[2];
               this.id_class[id_protected[33]] = var12;
            }
         }
      }
   }

   public rrCW(AutoTotem var1) {
      super(var1);
      this.id_private();
      rrfP_2 var6 = new rrfP_2();
      this.id_break[id_protected[0]] = var6;
      Integer var7 = Integer.valueOf(id_byte[0]);
      this.id_break[id_protected[1]] = var7;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1712092383;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4025807906270743502L;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_private();
      ((rrfP_2)this.id_break[id_protected[7]]).id_class(var1);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_private();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[2]]) {
         ((rrfP_2)this.id_break[id_protected[3]])
            .id_class(System.currentTimeMillis() - this.id_break[id_protected[4]] > id_case[0] ? id_catch[0] : id_catch[1]);
         if (this.id_continue().id_super()
            && ((rhz_3)((cb_3)id_import.id_class[id_protected[5]]).id_implements[id_protected[6]]).id_implements(new rdn_3(rdy_3.kL))) {
            this.id_byte();
            return;
         }

         this.id_class();
      }
   }

   @Override
   public void id_class() {
      this.id_private();
      if ((Integer)this.id_break[id_protected[34]] > id_byte[4]) {
         if ((Integer)this.id_break[id_protected[35]] > id_byte[5]) {
            ((Ax_1)id_import.id_class[id_protected[36]]).id_break((Integer)this.id_break[id_protected[37]]);
            ((Aq_1)((cb_3)id_import.id_class[id_protected[38]]).id_break[id_protected[39]])
               .id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
            ((Ax_1)id_import.id_class[id_protected[40]]).id_break((Integer)this.id_break[id_protected[41]]);
         } else {
            ((Aq_1)((cb_3)id_import.id_class[id_protected[42]]).id_break[id_protected[43]]).id_break(new rme_3((Integer)this.id_break[id_protected[44]]));
            ((Aq_1)((cb_3)id_import.id_class[id_protected[45]]).id_break[id_protected[46]])
               .id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
            ((Aq_1)((cb_3)id_import.id_class[id_protected[47]]).id_break[id_protected[48]])
               .id_break(new rme_3(((rhz_3)((cb_3)id_import.id_class[id_protected[49]]).id_implements[id_protected[50]]).id_protected));
         }

         this.id_implements();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{101, -77, -57, 103, 95, 116, -112, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new short[]{
         0,
         1,
         0,
         0,
         2,
         57,
         1,
         0,
         1,
         57,
         57,
         1,
         0,
         57,
         1,
         2,
         55,
         57,
         0,
         55,
         57,
         1,
         1,
         57,
         0,
         57,
         0,
         57,
         0,
         57,
         1,
         1,
         1,
         0,
         1,
         1,
         55,
         1,
         57,
         0,
         55,
         1,
         57,
         0,
         1,
         57,
         0,
         57,
         0,
         57,
         1,
         1,
         0
      };
   }

   private static void id_finally() {
      id_byte = new byte[]{-1, -1, 8, -1, -1, 8, -1, 3, 2};
   }

   private static void id_extends() {
      id_case = new long[]{200L, 0L};
   }

   private static void id_case() {
      id_catch = new boolean[]{true, false, true, false, true, false};
   }

   private void id_implements() {
      this.id_private();
      Integer var5 = Integer.valueOf(id_byte[6]);
      this.id_break[id_protected[51]] = var5;
      Boolean var6 = id_catch[3];
      this.id_class[id_protected[52]] = var6;
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[1] = 0;
         this.id_break[2] = 0L;
      }
   }

   @Override
   public boolean aK_() {
      this.id_implements();
      return super.aK_();
   }
}
