package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BI extends Pv_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static String[] id_throws;
   private static byte[] id_case;

   private static void id_byte() {
      id_byte = new short[]{0, 1, 1, 2, 1, 4, 0, 1, 2, 3, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0};
   }

   private boolean id_byte(String var1) {
      this.id_class();
      Bt_1 var2 = ((Bw_1)this.id_break[0]).id_class(var1);
      if (var2 == null) {
         return false;
      } else {
         rja_3 var3 = null;
         if (var2 instanceof Bn_1 var4) {
            try {
               var3 = var4.id_break(var1);
            } catch (Exception var6) {
               var6.printStackTrace();
               return false;
            }

            if (var3 == null) {
               return false;
            }

            var4.id_class(var3);
         }

         var2.id_throws(var1);
         if (var3 != null) {
            boolean var7 = ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_class(var3);
            var2.id_protected(this.id_class(var2.id_throws(), var7));
            if (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_protected(var2.id_throws()) && var7) {
               return false;
            }
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_finally()
            .id_class(Bp_1.id_class((Bq_1)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[1], var2, (BT)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[0]));
         return true;
      }
   }

   public BI(C_class var1) {
      super(var1);
      this.id_class();
      Bf_1 var6 = new Bf_1();
      this.id_break[0] = var6;
      ArrayList var7 = new ArrayList();
      this.id_break[1] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_class();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && !((List)this.id_break[1]).isEmpty()) {
         for (String var3 : this.id_class((List<String>)this.id_break[1]).values()) {
            this.id_byte(var3);
         }

         ((List)this.id_break[1]).clear();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1319939557;
   }

   static boolean id_class(String var0, String[] var1) {
      for (String var5 : var1) {
         if (!var0.contains(var5)) {
            return false;
         }
      }

      return id_protected[14];
   }

   private Map<Integer, String> id_class(List<String> var1) {
      if (var1.size() == 1) {
         return Map.of(0, (String)var1.get(0));
      } else {
         HashMap var2 = new HashMap();
         int var3 = 0;

         for (String var5 : var1) {
            String var6;
            if (var2.get(var3) != null) {
               var6 = (String)var2.get(var3) + " " + var5;
            } else {
               var6 = var5;
            }

            if (var5.contains("Координаты:")) {
               var2.put(var3, var6);
               var3++;
            } else {
               var2.put(var3, var6);
            }
         }

         return var2;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 765619834958450397L;
   }

   @Override
   public void id_class(rrLO var1) {
      this.id_class();
      if (var1.id_class() == null
         && (
            (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )) {
         String var2 = var1.id_protected();
         if (!this.id_byte(var2)) {
            if (((Pattern)Bl_1.id_class[0]).matcher(var2).find()
               || ((Pattern)Bl_1.id_class[1]).matcher(var2).find()
               || ((Pattern)Bl_1.id_class[2]).matcher(var2).find()
               || ((Pattern)Bl_1.id_class[3]).matcher(var2).find()) {
               ((List)this.id_break[1]).add(var2);
            }
         }
      }
   }

   private String id_class(String var1, boolean var2) {
      String var3 = var1;
      int var4 = 1;

      while (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_protected(var3) && !var2) {
         var3 = String.format(var1 + " %d", ++var4);
      }

      return var3;
   }

   private void id_class() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, -83, 46, 23, -128, 57, 28, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_case = new byte[]{2};
   }

   private static void id_throws() {
      id_throws = new String[]{new String("Координаты:")};
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, false, false, true, true, true, false, true, false, false, false, false, false, true};
   }
}
