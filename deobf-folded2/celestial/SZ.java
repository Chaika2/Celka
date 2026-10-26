package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum SZ implements Sm_1 {
   private static byte[] bytes42f0bef4cd2c3bea87db6b6dddd86070;
   public static Object[] staticFields42f0bef4cd2c3bea87db6b6dddd86070;
   public Object[] fields42f0bef4cd2c3bea87db6b6dddd86070;
   private static long[] longs42f0bef4cd2c3bea87db6b6dddd86070;
   private static boolean[] booleans42f0bef4cd2c3bea87db6b6dddd86070;
   private static String[] strings42f0bef4cd2c3bea87db6b6dddd86070;
   private static short[] shorts42f0bef4cd2c3bea87db6b6dddd86070;

   public long id_byte() {
      return (Long)this.fields42f0bef4cd2c3bea87db6b6dddd86070[1];
   }

   private SZ(String var3, long var4, Set<xd_3> var6) {
      this.id_protected();
      this.fields42f0bef4cd2c3bea87db6b6dddd86070[0] = var3;
      Long var12 = var4;
      this.fields42f0bef4cd2c3bea87db6b6dddd86070[1] = var12;
      this.fields42f0bef4cd2c3bea87db6b6dddd86070[2] = var6;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-58, 78, -59, -58, 65, 85, 44, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8955955273530642999L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -594739139;
   }

   public static SZ id_class(Collection<xd_3> var0) {
      for (SZ var4 : (SZ[])staticFields42f0bef4cd2c3bea87db6b6dddd86070[16]) {
         if (var4.id_class().equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   public Set<xd_3> id_class() {
      return (Set<xd_3>)this.fields42f0bef4cd2c3bea87db6b6dddd86070[2];
   }

   public String id_break() {
      return (String)this.fields42f0bef4cd2c3bea87db6b6dddd86070[0];
   }

   @Override
   public Stream<xd_3> id_throws() {
      return ((Set)this.fields42f0bef4cd2c3bea87db6b6dddd86070[2]).stream();
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{
         new SZ("Обычная", 15L, Set.of((xd_3)xu_3.id_volatile, (xd_3)xu_3.OJ, (xd_3)xu_3.hN, (xd_3)xu_3.id_catch)),
         new SZ(
            "Драконья",
            30L,
            Set.of(
               (xd_3)xu_3.JC,
               (xd_3)xu_3.Jn,
               (xd_3)xu_3.PD,
               (xd_3)xu_3.Jl,
               (xd_3)xu_3.JJ,
               (xd_3)xu_3.Jk,
               (xd_3)xu_3.JL,
               (xd_3)xu_3.Ge,
               (xd_3)xu_3.Jc,
               (xd_3)xu_3.JF
            )
         ),
         new SZ("Жемчужная", 15L, Set.of((xd_3)xu_3.Ev, (xd_3)xu_3.EZ, (xd_3)xu_3.EA, (xd_3)xu_3.Em, (xd_3)xu_3.EH, (xd_3)xu_3.El)),
         new SZ("Мистическая", 15L, Set.of((xd_3)xu_3.bH, (xd_3)xu_3.by, (xd_3)xu_3.bp, (xd_3)xu_3.hK, (xd_3)xu_3.bq, (xd_3)xu_3.Sh, (xd_3)xu_3.Bd)),
         new SZ("Призрачная", 15L, Set.of((xd_3)xu_3.sp, (xd_3)xu_3.sy, (xd_3)xu_3.EH, (xd_3)xu_3.Bs, (xd_3)xu_3.hl, (xd_3)xu_3.sq, (xd_3)xu_3.id_throws)),
         new SZ("Кошмарная", 15L, Set.of((xd_3)xu_3.sy, (xd_3)xu_3.bY, (xd_3)xu_3.PD, (xd_3)xu_3.Ju, (xd_3)xu_3.Jv)),
         new SZ("Зловещая", 15L, Set.of((xd_3)xu_3.bS, (xd_3)xu_3.hV, (xd_3)xu_3.Jc, (xd_3)xu_3.BT, (xd_3)xu_3.Bp, (xd_3)xu_3.By, (xd_3)xu_3.Ba, (xd_3)xu_3.Bq)),
         new SZ("Смертельная", 15L, Set.of((xd_3)xu_3.bR, (xd_3)xu_3.hc, (xd_3)xu_3.JI, (xd_3)xu_3.hY, (xd_3)xu_3.SP, (xd_3)xu_3.bV)),
         new SZ("Жестокая", 15L, Set.of((xd_3)xu_3.Jd, (xd_3)xu_3.JC, (xd_3)xu_3.JJ, (xd_3)xu_3.Jy, (xd_3)xu_3.JL, (xd_3)xu_3.Ju, (xd_3)xu_3.Jv)),
         new SZ("Ледяная", 15L, Set.of((xd_3)xu_3.Pq, (xd_3)xu_3.Mn, (xd_3)xu_3.Pt, (xd_3)xu_3.Ei, (xd_3)xu_3.PT)),
         new SZ("Коварная", 15L, Set.of((xd_3)xu_3.bR, (xd_3)xu_3.SS, (xd_3)xu_3.hc, (xd_3)xu_3.JI, (xd_3)xu_3.bs, (xd_3)xu_3.bg, (xd_3)xu_3.SP)),
         new SZ(
            "Проклятая",
            15L,
            Set.of(
               (xd_3)xu_3.Jd,
               (xd_3)xu_3.Jn,
               (xd_3)xu_3.Jl,
               (xd_3)xu_3.JJ,
               (xd_3)xu_3.Jk,
               (xd_3)xu_3.JL,
               (xd_3)xu_3.Ju,
               (xd_3)xu_3.Jm,
               (xd_3)xu_3.Jv,
               (xd_3)xu_3.JA
            )
         ),
         new SZ(
            "Мучительная",
            15L,
            Set.of((xd_3)xu_3.JC, (xd_3)xu_3.MR, (xd_3)xu_3.Jl, (xd_3)xu_3.JJ, (xd_3)xu_3.JL, (xd_3)xu_3.Ju, (xd_3)xu_3.Ea, (xd_3)xu_3.Jw, (xd_3)xu_3.Jm)
         ),
         new SZ(
            "Царская",
            15L,
            Set.of((xd_3)xu_3.JJ, (xd_3)xu_3.hD, (xd_3)xu_3.hm, (xd_3)xu_3.Jy, (xd_3)xu_3.id_throws, (xd_3)xu_3.id_case, (xd_3)xu_3.BJ, (xd_3)xu_3.hL)
         ),
         new SZ("Сингулярная", 15L, Set.of((xd_3)xu_3.MR, (xd_3)xu_3.Ea, (xd_3)xu_3.Jv)),
         new SZ("Неизбежная", 15L, Set.of((xd_3)xu_3.id_catch, (xd_3)xu_3.OJ, (xd_3)xu_3.PD, (xd_3)xu_3.hN)),
         null,
         null
      };
      var0[16] = new SZ[]{
         (SZ)var0[0],
         (SZ)var0[1],
         (SZ)var0[2],
         (SZ)var0[3],
         (SZ)var0[4],
         (SZ)var0[5],
         (SZ)var0[6],
         (SZ)var0[7],
         (SZ)var0[8],
         (SZ)var0[9],
         (SZ)var0[10],
         (SZ)var0[11],
         (SZ)var0[12],
         (SZ)var0[13],
         (SZ)var0[14],
         (SZ)var0[15]
      };
      var0[17] = new SZ[]{
         (SZ)var0[0],
         (SZ)var0[1],
         (SZ)var0[2],
         (SZ)var0[3],
         (SZ)var0[4],
         (SZ)var0[5],
         (SZ)var0[6],
         (SZ)var0[7],
         (SZ)var0[8],
         (SZ)var0[9],
         (SZ)var0[10],
         (SZ)var0[11],
         (SZ)var0[12],
         (SZ)var0[13],
         (SZ)var0[14],
         (SZ)var0[15]
      };
      staticFields42f0bef4cd2c3bea87db6b6dddd86070 = var0;
   }

   private static void id_catch() {
      shorts42f0bef4cd2c3bea87db6b6dddd86070 = new short[]{17, 16, 2, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
   }

   private static void id_extends() {
      bytes42f0bef4cd2c3bea87db6b6dddd86070 = new byte[]{
         16,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         2,
         2,
         3,
         3,
         4,
         4,
         5,
         5,
         6,
         6,
         7,
         7,
         8,
         8,
         9,
         9,
         10,
         10,
         11,
         11,
         12,
         12,
         13,
         13,
         14,
         14,
         15,
         15,
         17,
         16,
         3,
         18
      };
   }

   @Override
   public int id_case() {
      return ((Set)this.fields42f0bef4cd2c3bea87db6b6dddd86070[2]).size();
   }

   private static void id_implements() {
      strings42f0bef4cd2c3bea87db6b6dddd86070 = new String[]{
         new String("DEFAULT"),
         new String("Обычная"),
         new String("DRAGON"),
         new String("Драконья"),
         new String("PEARL"),
         new String("Жемчужная"),
         new String("MYSTIC"),
         new String("Мистическая"),
         new String("GHOST"),
         new String("Призрачная"),
         new String("NIGHTMARISH"),
         new String("Кошмарная"),
         new String("SPOOKY"),
         new String("Зловещая"),
         new String("LETHAL"),
         new String("Смертельная"),
         new String("CRUEL"),
         new String("Жестокая"),
         new String("ICY"),
         new String("Ледяная"),
         new String("INSIDIOUS"),
         new String("Коварная"),
         new String("CURSED"),
         new String("Проклятая"),
         new String("EXCRUCIATING"),
         new String("Мучительная"),
         new String("ROYAL"),
         new String("Царская"),
         new String("SINGULAR"),
         new String("Сингулярная"),
         new String("UNVOIDABLE"),
         new String("Неизбежная")
      };
   }

   private void id_protected() {
      if (this.fields42f0bef4cd2c3bea87db6b6dddd86070 == null) {
         this.fields42f0bef4cd2c3bea87db6b6dddd86070 = new Object[3];
         Object[] var1 = this.fields42f0bef4cd2c3bea87db6b6dddd86070;
         var1[1] = 0L;
      }
   }

   private static void id_final() {
      longs42f0bef4cd2c3bea87db6b6dddd86070 = new long[]{15L, 30L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 15L, 0L};
   }

   private static void id_volatile() {
      booleans42f0bef4cd2c3bea87db6b6dddd86070 = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
