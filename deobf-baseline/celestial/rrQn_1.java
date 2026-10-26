package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQn_1 extends Lg_1<rrQn_1> implements AutoCloseable {
   private static String[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static int[] id_protected;
   private static short[] id_throws;
   private static float[] id_case;
   private static byte[] id_catch;
   private static long[] id_private;
   private static boolean[] id_implements;

   public long id_byte() {
      this.id_int();
      return (Long)this.id_class[id_throws[58]];
   }

   private void id_int() {
      if (this.id_class == null) {
         this.id_class = new Object[id_catch[22]];
         Object[] var1 = this.id_class;
         var1[id_catch[23]] = id_private[1];
         var1[id_catch[24]] = id_implements[25];
         var1[id_catch[25]] = id_implements[26];
         var1[id_catch[26]] = id_implements[27];
      }
   }

   public rrQn_1(rrQA var1, QY var2, rrQC var3, rrQx_1 var4) {
      this.id_int();
      this.id_class[id_throws[0]] = var1;
      this.id_class[id_throws[1]] = var2;
      this.id_class[id_throws[2]] = var3;
      this.id_class[id_throws[3]] = var4;
      UUID var5 = ((rrQx_1)this.id_class[id_throws[4]]).id_protected();
      rqO_2 var14 = jH_2.id_class(var5);
      this.id_class[id_throws[5]] = var14;
      Boolean var15 = jH_2.id_break(var5).equalsIgnoreCase(id_byte[0]);
      this.id_class[id_throws[6]] = var15;
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1, int var2) {
      this.id_int();

      try {
         List var3 = ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_throws[46]]).id_class();
         rrQx_1 var4 = (rrQx_1)var3.get(var1);
         var3.set(var1, (rrQx_1)var3.get(var2));
         var3.set(var2, var4);
         List var5 = ((rrQA)this.id_class[id_throws[47]]).x_();
         rrQn_1 var6 = (rrQn_1)rrQA.id_byte((rrQA)this.id_class[id_throws[48]], var1);
         var5.set(var1, (rrQn_1)rrQA.id_break((rrQA)this.id_class[id_throws[49]], var2));
         var5.set(var2, var6);
         rrQn_1 var7 = (rrQn_1)rrQA.id_class((rrQA)this.id_class[id_throws[50]], var2);
         ((rrQA)this.id_class[id_throws[51]]).id_class(var7);
         rrQA.id_class((rrQA)this.id_class[id_throws[52]], var7);
         ((Lu_1)((rrQC)this.id_class[id_throws[53]]).id_class[id_throws[54]]).id_byte(id_implements[23]);
      } catch (Exception var8) {
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.id_int();
      Boolean var19 = id_implements[0];
      this.id_class[id_throws[7]] = var19;
      Boolean var20 = id_implements[1];
      this.id_class[id_throws[8]] = var20;
      rrQx_1 var11 = (rrQx_1)this.id_class[id_throws[9]];
      int var12 = id_protected[0];
      if (var11.id_class().equals(((QY)this.id_class[id_throws[10]]).id_while().id_byte())) {
         var12 = id_protected[1];
      }

      rrfD_2.id_class(
         var1,
         (rqO_2)this.id_class[id_throws[11]],
         ((Qw_1)((QY)this.id_class[id_throws[12]]).id_class[id_throws[13]]).id_break(rhQ_2.HAT),
         (float)var4,
         (float)var3,
         id_catch[0],
         id_catch[1],
         id_case[0]
      );
      ((cm_3)((QY)this.id_class[id_throws[14]]).id_class[id_throws[15]])
         .id_break(var1, var11.id_class(), (float)(var4 + id_catch[2] + id_catch[3]), (float)(var3 + id_catch[4]), var12);
      if (var9) {
         ch_3.id_class(var1, var4, var3, var4 + id_catch[5], var3 + id_catch[6], id_protected[2]);
      }

      if (this == ((rrQA)this.id_class[id_throws[16]]).id_finally()) {
         ((QY)this.id_class[id_throws[17]]).A().id_class((rqO_2)id_break[id_throws[18]]);
         RenderSystem.color4f(id_case[1], id_case[2], id_case[3], id_case[4]);
         boolean var13 = var2 + id_implements[2] < ((rrQA)this.id_class[id_throws[19]]).id_this().size() ? id_implements[3] : id_implements[4];
         boolean var14 = var2 > 0 ? id_implements[5] : id_implements[6];
         if (var13) {
            Boolean var21 = var9 && var7 > var4 + var5 - id_catch[7] && var7 < var4 + var5 - id_catch[8] ? id_implements[7] : id_implements[8];
            this.id_class[id_throws[20]] = var21;
            ch_3.id_class(
               var1,
               var4 + var5 - id_catch[9],
               var3 - id_catch[10],
               id_case[5],
               this.id_class[id_throws[21]] ? id_case[6] : id_case[7],
               id_catch[11],
               id_catch[12],
               id_throws[22],
               id_throws[23]
            );
         }

         if (var14) {
            Boolean var22 = var9 && var7 > var4 + var5 - (var13 ? id_catch[13] : id_catch[14]) && var7 < var4 + var5 - (var13 ? id_catch[15] : id_catch[16])
               ? id_implements[9]
               : id_implements[10];
            this.id_class[id_throws[24]] = var22;
            ch_3.id_class(
               var1,
               var4 + var5 - (var13 ? id_catch[17] : id_catch[18]),
               var3 - id_catch[19],
               id_case[8],
               this.id_class[id_throws[25]] ? id_case[9] : id_case[10],
               id_catch[20],
               id_catch[21],
               id_throws[26],
               id_throws[27]
            );
         }
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_int();
      if (vm_3.id_synchronized()) {
         List var4 = ((rrQA)this.id_class[id_throws[39]]).x_();
         int var5 = var4.indexOf(this);
         if (var1 == id_throws[40] && var5 < var4.size() - id_implements[17]) {
            this.id_class(var5, var5 + id_implements[18]);
            return id_implements[19];
         }

         if (var1 == id_throws[41] && var5 > 0) {
            this.id_class(var5, var5 - id_implements[20]);
            return id_implements[21];
         }
      } else if (var1 == id_throws[42] || var1 == id_throws[43]) {
         ((rrQC)this.id_class[id_throws[44]]).id_class(this.id_private());
         ((QY)this.id_class[id_throws[45]]).c().id_class(Np_1.id_class(rqn_3.dw, id_case[12]));
         return id_implements[22];
      }

      return super.id_class(var1, var2, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, -33, 9, 94, 26, 11, 88, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5782161596536643685L;
   }

   public boolean id_class() {
      this.id_int();
      return (Boolean)this.id_class[id_throws[60]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 758730307;
   }

   @Override
   public void close() {
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_int();
      ((rrQA)this.id_class[id_throws[28]]).id_class(this);
      ((rrQC)this.id_class[id_throws[29]]).id_byte(((rrQA)this.id_class[id_throws[30]]).id_private().isPresent());
      if (var5 == 0) {
         List var6 = ((rrQA)this.id_class[id_throws[31]]).id_this();
         int var7 = var6.indexOf(this);
         if ((Boolean)this.id_class[id_throws[32]] && var7 + id_implements[11] < var6.size()) {
            this.id_class(var7, var7 + id_implements[12]);
            return id_implements[13];
         }

         if ((Boolean)this.id_class[id_throws[33]] && var7 > 0) {
            this.id_class(var7, var7 - id_implements[14]);
            return id_implements[15];
         }

         if (rqR_2.id_break() - (Long)this.id_class[id_throws[34]] < id_private[0]) {
            ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_throws[35]]).id_class((rrQx_1)this.id_class[id_throws[36]]);
            ((QY)this.id_class[id_throws[37]]).c().id_class(Np_1.id_class(rqn_3.dw, id_case[11]));
            return id_implements[16];
         }

         Long var12 = rqR_2.id_break();
         this.id_class[id_throws[38]] = var12;
      }

      return super.id_break(var1, var3, var5);
   }

   public rqO_2 id_break() {
      this.id_int();
      return (rqO_2)this.id_class[id_throws[59]];
   }

   public boolean id_throws() {
      this.id_int();
      return (Boolean)this.id_class[id_throws[61]];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", id_byte[1]), 12};
      id_break = var0;
   }

   public QY id_catch() {
      this.id_int();
      return (QY)this.id_class[id_throws[55]];
   }

   private static void id_extends() {
      id_catch = new byte[]{12, 12, 12, 3, 2, 12, 12, 16, 6, 35, 18, 32, 32, 31, 20, 17, 6, 31, 20, 3, 32, 32, 9, 3, 5, 6, 7, 2, 12};
   }

   public boolean id_case() {
      this.id_int();
      return (Boolean)this.id_class[id_throws[62]];
   }

   private static void id_implements() {
      id_private = new long[]{250L, 0L};
   }

   private static void id_new() {
      id_implements = new boolean[]{
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void id_package() {
      id_protected = new int[]{16777215, 65280, -1601138544};
   }

   public rrQC id_protected() {
      this.id_int();
      return (rrQC)this.id_class[id_throws[57]];
   }

   public rrQx_1 id_private() {
      this.id_int();
      return (rrQx_1)this.id_class[id_throws[56]];
   }

   private static void id_final() {
      id_throws = new short[]{
         8,
         0,
         2,
         1,
         1,
         4,
         5,
         6,
         7,
         1,
         0,
         4,
         0,
         20,
         0,
         15,
         8,
         0,
         0,
         8,
         6,
         6,
         256,
         256,
         7,
         7,
         256,
         256,
         8,
         2,
         8,
         8,
         6,
         7,
         3,
         0,
         1,
         0,
         3,
         8,
         264,
         265,
         261,
         259,
         2,
         0,
         0,
         8,
         8,
         8,
         8,
         8,
         8,
         2,
         4,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7
      };
   }

   private static void id_volatile() {
      id_case = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 48.0F, 32.0F, 0.0F, 96.0F, 32.0F, 0.0F, 1.0F, 1.0F};
   }

   private static void id_native() {
      id_byte = new String[]{new String("slim"), new String("textures/gui/server_selection.png")};
   }
}
