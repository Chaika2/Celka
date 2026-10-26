package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNd_1 extends rrwI_2 implements Comparable<rrNd_1>, rrNJ, rrNx_1 {
   public Object[] id_class;
   private static float[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_catch;

   public List<String> id_char() {
      this.id_static();
      return (List<String>)this.id_class[id_protected[127]];
   }

   public void id_byte(boolean var1) {
      this.id_static();
      Boolean var6 = var1;
      this.id_class[id_protected[139]] = var6;
   }

   public void id_byte(int var1) {
      this.id_static();
      Integer var6 = var1;
      this.id_class[id_protected[143]] = var6;
   }

   public rrNd_1 id_byte() {
      this.id_static();
      return new rrNk_1()
         .id_class((rdb_3)this.id_class[id_protected[63]])
         .id_protected((Integer)this.id_class[id_protected[64]])
         .id_break((Integer)this.id_class[id_protected[65]])
         .id_native((List<rrfA_2>)this.id_class[id_protected[66]])
         .id_throws((List<rrfA_2>)this.id_class[id_protected[67]])
         .id_protected((List<rrfA_2>)this.id_class[id_protected[68]])
         .id_implements((List<FuntimeEnchantment>)this.id_class[id_protected[69]])
         .id_break((List<FuntimeEnchantment>)this.id_class[id_protected[70]])
         .id_finally((List<FuntimeEnchantment>)this.id_class[id_protected[71]])
         .id_case((List<String>)this.id_class[id_protected[72]])
         .id_private((List<String>)this.id_class[id_protected[73]])
         .id_extends((List<String>)this.id_class[id_protected[74]])
         .id_class((List<String>)this.id_class[id_protected[75]])
         .id_volatile((List<String>)this.id_class[id_protected[76]])
         .id_catch((List<rrcT_2<?>>)this.id_class[id_protected[77]])
         .id_class((rdn_3)this.id_class[id_protected[78]])
         .id_byte((List<String>)this.id_class[id_protected[79]])
         .id_break((String)this.id_class[id_protected[80]])
         .id_byte((String)this.id_class[id_protected[81]])
         .id_byte((Boolean)this.id_class[id_protected[82]])
         .id_class((rrNw_1)this.id_class[id_protected[83]])
         .id_class((rrNX)this.id_class[id_protected[84]])
         .id_protected((Boolean)this.id_class[id_protected[85]])
         .id_throws((Boolean)this.id_class[id_protected[86]])
         .id_class((rrIk_1)this.id_class[id_protected[87]])
         .id_byte((Integer)this.id_class[id_protected[88]])
         .id_class((Boolean)this.id_class[id_protected[89]])
         .id_break((Boolean)this.id_class[id_protected[90]])
         .id_break();
   }

   public List<String> id_int() {
      this.id_static();
      return (List<String>)this.id_class[id_protected[125]];
   }

   private static void id_long() {
      id_break = new float[]{5.0F, 100.0F, 5.0F, 1.0F, 1.0F};
   }

   rrNd_1(rrNk_1 var1) {
      this.id_static();
      rdb_3 var6 = (rdb_3)var1.id_class[id_protected[0]];
      this.id_class[id_protected[1]] = var6;
      Integer var7 = (Integer)var1.id_class[id_protected[2]];
      this.id_class[id_protected[3]] = var7;
      Integer var8 = (Integer)var1.id_class[id_protected[4]];
      this.id_class[id_protected[5]] = var8;
      List var9 = (List)var1.id_class[id_protected[6]];
      this.id_class[id_protected[7]] = var9;
      List var10 = (List)var1.id_class[id_protected[8]];
      this.id_class[id_protected[9]] = var10;
      List var11 = (List)var1.id_class[id_protected[10]];
      this.id_class[id_protected[11]] = var11;
      List var12 = (List)var1.id_class[id_protected[12]];
      this.id_class[id_protected[13]] = var12;
      List var13 = (List)var1.id_class[id_protected[14]];
      this.id_class[id_protected[15]] = var13;
      List var14 = (List)var1.id_class[id_protected[16]];
      this.id_class[id_protected[17]] = var14;
      List var15 = (List)var1.id_class[id_protected[18]];
      this.id_class[id_protected[19]] = var15;
      List var16 = (List)var1.id_class[id_protected[20]];
      this.id_class[id_protected[21]] = var16;
      List var17 = (List)var1.id_class[id_protected[22]];
      this.id_class[id_protected[23]] = var17;
      List var18 = (List)var1.id_class[id_protected[24]];
      this.id_class[id_protected[25]] = var18;
      List var19 = (List)var1.id_class[id_protected[26]];
      this.id_class[id_protected[27]] = var19;
      List var20 = (List)var1.id_class[id_protected[28]];
      this.id_class[id_protected[29]] = var20;
      rdn_3 var21 = (rdn_3)var1.id_class[id_protected[30]];
      this.id_class[id_protected[31]] = var21;
      List var22 = (List)var1.id_class[id_protected[32]];
      this.id_class[id_protected[33]] = var22;
      String var23 = (String)var1.id_class[id_protected[34]];
      this.id_class[id_protected[35]] = var23;
      String var24 = (String)var1.id_class[id_protected[36]];
      this.id_class[id_protected[37]] = var24;
      Boolean var25 = (Boolean)var1.id_class[id_protected[38]];
      this.id_class[id_protected[39]] = var25;
      rrNw_1 var26 = (rrNw_1)var1.id_class[id_protected[40]];
      this.id_class[id_protected[41]] = var26;
      rrNX var27 = (rrNX)var1.id_class[id_protected[42]];
      this.id_class[id_protected[43]] = var27;
      Boolean var28 = (Boolean)var1.id_class[id_protected[44]];
      this.id_class[id_protected[45]] = var28;
      rrIk_1 var29 = (rrIk_1)var1.id_class[id_protected[46]];
      this.id_class[id_protected[47]] = var29;
      Boolean var30 = (Boolean)var1.id_class[id_protected[48]];
      this.id_class[id_protected[49]] = var30;
      Integer var31 = (Integer)var1.id_class[id_protected[50]];
      this.id_class[id_protected[51]] = var31;
      Boolean var32 = (Boolean)var1.id_class[id_protected[52]] == null
         ? ((rdb_3)this.id_class[id_protected[53]]).id_extends()
         : (Boolean)var1.id_class[id_protected[54]];
      this.id_class[id_protected[55]] = var32;
      Boolean var33 = (Boolean)var1.id_class[id_protected[56]];
      this.id_class[id_protected[57]] = var33;
      this.id_class(new rrIk_1(id_throws[0], this.id_class()).id_class(id_throws[1], (var1x, var2) -> this.id_class(var1x.id_byte())));
      if ((rrIk_1)this.id_class[id_protected[58]] != null) {
         this.id_class((Setting)((rrIk_1)this.id_class[id_protected[59]]));
      }

      if ((Boolean)this.id_class[id_protected[60]]) {
         this.id_class(new rrIk_1(id_throws[2], this.id_return()).id_class(id_throws[3], (var1x, var2) -> this.id_byte(var1x.id_byte())));
         this.id_class(
               new rrIm_1(id_throws[4], (float)this.id_public(), id_break[0], id_break[1], id_break[2])
                  .id_class(id_throws[5], (var1x, var2) -> this.id_byte(var1x.id_byte().intValue()))
            )
            .id_class(() -> this.id_return());
      }

      if (((rdb_3)this.id_class[id_protected[61]]).id_implements() > id_catch[0]) {
         this.id_class(
            new rrIm_1(id_throws[6], (float)this.id_native(), id_break[3], (float)((rdb_3)this.id_class[id_protected[62]]).id_implements(), id_break[4])
               .id_class(id_throws[7], (var1x, var2) -> this.id_class(var1x.id_byte().intValue()))
         );
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.id_static();
      if (this == var1) {
         return id_catch[6];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNd_1 var2 = (rrNd_1)var1;
         return (rrNw_1)this.id_class[id_protected[102]] != null && (rrNw_1)var2.id_class[id_protected[103]] != null
            ? Objects.equals((rrNw_1)this.id_class[id_protected[106]], (rrNw_1)var2.id_class[id_protected[107]])
            : Objects.equals((String)this.id_class[id_protected[104]], (String)var2.id_class[id_protected[105]]);
      } else {
         return id_catch[7];
      }
   }

   @Override
   public int hashCode() {
      this.id_static();
      return (rrNw_1)this.id_class[id_protected[108]] == null
         ? Objects.hashCode((String)this.id_class[id_protected[109]])
         : Objects.hashCode((rrNw_1)this.id_class[id_protected[110]]);
   }

   public List<FuntimeEnchantment> id_this() {
      this.id_static();
      return (List<FuntimeEnchantment>)this.id_class[id_protected[122]];
   }

   public List<FuntimeEnchantment> id_interface() {
      this.id_static();
      return (List<FuntimeEnchantment>)this.id_class[id_protected[121]];
   }

   public void id_class(rrfq_3 var1) {
      this.id_static();
      this.id_class[id_protected[148]] = var1;
   }

   public void id_class(rrNw_1 var1) {
      this.id_static();
      this.id_class[id_protected[93]] = var1;
   }

   @Override
   public boolean id_class() {
      this.id_static();
      return (Boolean)this.id_class[id_protected[92]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, -58, 124, -13, -49, -59, -105, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrIk_1 var1) {
      this.id_static();
      this.id_class[id_protected[141]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8295465653232815669L;
   }

   public void id_class(int var1) {
      this.id_static();
      Integer var6 = var1;
      this.id_class[id_protected[144]] = var6;
   }

   public void id_class(boolean var1) {
      this.id_static();
      Boolean var6 = var1;
      this.id_class[id_protected[137]] = var6;
   }

   @Override
   public boolean id_class(rrNw_1 var1, Predicate<rrcT_2<?>> var2) {
      this.id_static();

      for (rrcT_2 var4 : (List)this.id_class[id_protected[91]]) {
         if (var2 == null || var2.test(var4)) {
            rrfI_2 var5 = var4.id_class(this, var1);
            if (!var5.id_byte()) {
               return id_catch[1];
            }
         }
      }

      return id_catch[2];
   }

   public int id_class(rrNd_1 var1) {
      this.id_static();
      if (var1 == null) {
         throw new NullPointerException(id_throws[8]);
      } else if ((rrNw_1)this.id_class[id_protected[94]] != null && (rrNw_1)var1.id_class[id_protected[95]] != null) {
         rdb_3 var2 = ((rrNw_1)this.id_class[id_protected[96]]).id_protected().id_break();
         rdb_3 var3 = ((rrNw_1)var1.id_class[id_protected[97]]).id_protected().id_break();
         if (var2 == rdy_3.kL || var3 == rdy_3.kL) {
            return id_catch[4];
         } else if (var2 != rdy_3.dJ && var3 != rdy_3.dJ) {
            int var4 = Math.abs((Integer)this.id_class[id_protected[98]] - ((rrNw_1)this.id_class[id_protected[99]]).id_case());
            int var5 = Math.abs((Integer)var1.id_class[id_protected[100]] - ((rrNw_1)var1.id_class[id_protected[101]]).id_case());
            return Integer.compare(var5, var4);
         } else {
            return id_catch[5];
         }
      } else {
         return id_catch[3];
      }
   }

   private static void id_default() {
      id_protected = new short[]{
         0,
         0,
         2,
         1,
         3,
         2,
         5,
         4,
         6,
         5,
         7,
         6,
         8,
         7,
         9,
         8,
         10,
         9,
         11,
         10,
         12,
         11,
         13,
         12,
         14,
         13,
         15,
         14,
         16,
         15,
         17,
         16,
         18,
         17,
         19,
         18,
         20,
         19,
         21,
         20,
         22,
         21,
         23,
         22,
         25,
         25,
         28,
         27,
         26,
         26,
         4,
         3,
         27,
         0,
         27,
         23,
         24,
         24,
         27,
         27,
         23,
         0,
         0,
         0,
         1,
         2,
         4,
         5,
         6,
         7,
         8,
         9,
         11,
         10,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         25,
         26,
         27,
         3,
         23,
         24,
         15,
         25,
         21,
         21,
         21,
         21,
         21,
         1,
         21,
         1,
         21,
         21,
         21,
         18,
         18,
         21,
         21,
         21,
         18,
         21,
         28,
         28,
         0,
         1,
         1,
         2,
         4,
         5,
         6,
         7,
         8,
         9,
         11,
         10,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         20,
         21,
         22,
         25,
         26,
         26,
         27,
         27,
         3,
         3,
         2,
         23,
         24,
         28,
         28
      };
   }

   private static void id_short() {
      id_throws = new String[]{
         new String("Работать с Auto Parser"),
         new String("auto_parser"),
         new String("Проверять прочность"),
         new String("durability"),
         new String("Мин. прочность в процентах"),
         new String("min_durability"),
         new String("Минимальное количество"),
         new String("min_count"),
         new String("otherItem is marked non-null but is null")
      };
   }

   private static void id_void() {
      id_byte = new byte[]{29, 2, 3, 20, 23, 24, 25, 26};
   }

   @Nullable
   @Override
   public rrNw_1 id_break() {
      this.id_static();
      return (rrNw_1)this.id_class[id_protected[135]];
   }

   public void id_break(boolean var1) {
      this.id_static();
      Boolean var6 = var1;
      this.id_class[id_protected[134]] = var6;
   }

   public void id_break(int var1) {
      this.id_static();
      Integer var6 = var1;
      this.id_class[id_protected[115]] = var6;
   }

   public boolean id_throws() {
      this.id_static();
      return (Boolean)this.id_class[id_protected[145]];
   }

   public rrfq_3 id_finally() {
      this.id_static();
      return (rrfq_3)this.id_class[id_protected[147]];
   }

   public rdb_3 id_catch() {
      this.id_static();
      return (rdb_3)this.id_class[id_protected[113]];
   }

   public List<String> id_extends() {
      this.id_static();
      return (List<String>)this.id_class[id_protected[123]];
   }

   public List<rrfA_2> id_goto() {
      this.id_static();
      return (List<rrfA_2>)this.id_class[id_protected[119]];
   }

   public String id_case() {
      this.id_static();
      return (String)this.id_class[id_protected[131]];
   }

   public rrNX id_continue() {
      this.id_static();
      return (rrNX)this.id_class[id_protected[136]];
   }

   public int id_else() {
      this.id_static();
      return (Integer)this.id_class[id_protected[114]];
   }

   public boolean id_implements() {
      this.id_static();
      return (Boolean)this.id_class[id_protected[146]];
   }

   private static void id_import() {
      id_catch = new boolean[]{true, false, true, false, false, false, true, false, true, false, false, false, false, false, false, false, false};
   }

   public List<rrcT_2<?>> id_instanceof() {
      this.id_static();
      return (List<rrcT_2<?>>)this.id_class[id_protected[128]];
   }

   public List<rrfA_2> id_new() {
      this.id_static();
      return (List<rrfA_2>)this.id_class[id_protected[118]];
   }

   public rdn_3 id_package() {
      this.id_static();
      return (rdn_3)this.id_class[id_protected[129]];
   }

   public boolean id_return() {
      this.id_static();
      return (Boolean)this.id_class[id_protected[138]];
   }

   public List<rrfA_2> id_super() {
      this.id_static();
      return (List<rrfA_2>)this.id_class[id_protected[117]];
   }

   public List<FuntimeEnchantment> id_throw() {
      this.id_static();
      return (List<FuntimeEnchantment>)this.id_class[id_protected[120]];
   }

   public List<String> id_try() {
      this.id_static();
      return (List<String>)this.id_class[id_protected[124]];
   }

   public boolean id_while() {
      this.id_static();
      return (Boolean)this.id_class[id_protected[133]];
   }

   private void id_static() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_catch[8]] = Integer.valueOf(id_catch[9]);
         var1[id_byte[1]] = Integer.valueOf(id_catch[10]);
         var1[id_byte[2]] = Integer.valueOf(id_catch[11]);
         var1[id_byte[3]] = id_catch[12];
         var1[id_byte[4]] = id_catch[13];
         var1[id_byte[5]] = id_catch[14];
         var1[id_byte[6]] = id_catch[15];
         var1[id_byte[7]] = id_catch[16];
      }
   }

   public int id_public() {
      this.id_static();
      return (Integer)this.id_class[id_protected[142]];
   }

   public List<String> id_protected() {
      this.id_static();
      return (List<String>)this.id_class[id_protected[126]];
   }

   private static int id_protected(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 731010327;
   }

   public List<String> id_private() {
      this.id_static();
      return (List<String>)this.id_class[id_protected[130]];
   }

   public String id_abstract() {
      this.id_static();
      return (String)this.id_class[id_protected[132]];
   }

   public rrIk_1 id_final() {
      this.id_static();
      return (rrIk_1)this.id_class[id_protected[140]];
   }

   public String id_volatile() {
      this.id_static();
      String var1 = this.id_case();
      return (rrfq_3)this.id_class[id_protected[111]] == null ? var1 : ((rrfq_3)this.id_class[id_protected[112]]).name() + ":" + var1;
   }

   @Override
   public String id_synchronized() {
      return this.id_case();
   }

   public int id_native() {
      this.id_static();
      return (Integer)this.id_class[id_protected[116]];
   }
}
