package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqZ_2 extends rrqN_2 {
   private static byte[] id_byte;
   private static long[] id_protected;
   private static short[] id_case;
   private static boolean[] id_catch;
   private static String[] id_private;
   public Object[] id_class;

   private static void id_byte() {
      id_case = new short[]{0, 1, 3, 0, 3, 2, 1, 3, 2, 2, 3, 1, 2, 2, 3, 1, 0, 2, 3, 0, 0, 0, 1, 0};
   }

   public rrqZ_2(XRay<?> var1) {
      super(var1);
      this.id_case();
      HashMap var6 = new HashMap();
      this.id_class[id_case[0]] = var6;
      HashSet var7 = new HashSet();
      this.id_class[id_case[1]] = var7;
      Long var8 = id_protected[0];
      this.id_class[id_case[2]] = var8;
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_case();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[3]]) {
         XRay var2 = this.id_continue();
         this.id_final().removeIf(var1x -> {
            this.id_case();
            rfH_2 var2x = var1x.id_break();
            if (rrjc_3.id_protected(var2x) == xu_3.Jx) {
               ((Map)this.id_class[id_case[20]]).put(var2x, var1x);
               return id_catch[7];
            } else if (((Map)this.id_class[id_case[21]]).containsKey(var2x)) {
               ((Set)this.id_class[id_case[22]]).remove(var1x);
               ((Map)this.id_class[id_case[23]]).remove(var2x);
               return id_catch[8];
            } else {
               return id_catch[9];
            }
         });
         if ((Long)this.id_class[id_case[4]] != id_protected[1]
            && (Integer)this.id_class[id_case[5]] > 0
            && !((Set)this.id_class[id_case[6]]).isEmpty()
            && rqR_2.id_break() - (Long)this.id_class[id_case[7]] > id_protected[2]) {
            int var3 = (Integer)this.id_class[id_case[8]];
            long var10000 = (long)var3;
            String[] var10001 = new String[id_byte[0]];
            var10001[id_catch[0]] = id_private[0];
            var10001[id_catch[1]] = id_private[1];
            var10001[id_byte[1]] = id_private[2];
            String var4 = rql_3.id_class(var10000, var10001);
            var10000 = (long)var3;
            var10001 = new String[id_byte[2]];
            var10001[id_catch[2]] = id_private[3];
            var10001[id_catch[3]] = id_private[4];
            var10001[id_byte[3]] = id_private[5];
            String var5 = rql_3.id_class(var10000, var10001);
            rVi_1 var6 = new rgN_2(id_private[6])
               .id_break(rgF_2.GRAY)
               .id_break(rrfu_3.id_class((Module)var2) + var4 + " " + rgF_2.RED + var3 + " " + rgF_2.GRAY + var5);
            rrfu_3.id_class(var6);
            Integer var11 = Integer.valueOf(id_catch[4]);
            this.id_class[id_case[9]] = var11;
            Long var12 = id_protected[3];
            this.id_class[id_case[10]] = var12;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1756624687;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5811737766451232406L;
   }

   private rrqc_3 id_class(xd_3 var1, rfH_2 var2) {
      return new rrqc_3(
         new rrqz_3(var1, ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_case[19]]).id_class(var1)),
         new rfH_2(var2),
         new rja_3(var2.b_(), var2.c_(), var2.d_())
      );
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rvC_2 var3) {
         var3.id_class((var1x, var2x) -> this.id_break(var1x, var2x));
      } else if (var2 instanceof rZR var4) {
         this.id_break(var4.id_byte(), var4.id_break());
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, -31, -127, 19, 59, -91, 79, -106}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_protected = new long[]{-1L, -1L, 100L, -1L, -1L, 0L};
   }

   private void id_break(rfH_2 var1, xc_3 var2) {
      this.id_case();
      xd_3 var3 = var2.id_break();
      if (var3 == xu_3.Jx) {
         rrqc_3 var4 = this.id_class(var3, var1);
         this.id_class(var4);
         if (((Set)this.id_class[id_case[11]]).add(var4)) {
            Integer var9 = (Integer)this.id_class[id_case[12]] + id_catch[5];
            this.id_class[id_case[13]] = var9;
            Long var10 = rqR_2.id_break();
            this.id_class[id_case[14]] = var10;
         }
      }
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[2] = 0;
         this.id_class[3] = 0L;
      }
   }

   private static void id_implements() {
      id_catch = new boolean[]{false, true, false, true, false, true, false, false, true, false, false};
   }

   private static void id_protected() {
      id_private = new String[]{
         new String("Был найден"),
         new String("Было найдено"),
         new String("Было найдено"),
         new String("Древний обломок"),
         new String("Древних обломка"),
         new String("Древних обломков"),
         new String("")
      };
   }

   private static void id_private() {
      id_byte = new byte[]{3, 2, 3, 2, 4, 2, 3};
   }

   @Override
   public boolean aK_() {
      this.id_case();
      ((Set)this.id_class[id_case[15]]).clear();
      ((Map)this.id_class[id_case[16]]).clear();
      Integer var5 = Integer.valueOf(id_catch[6]);
      this.id_class[id_case[17]] = var5;
      Long var6 = id_protected[4];
      this.id_class[id_case[18]] = var6;
      return super.aK_();
   }
}
