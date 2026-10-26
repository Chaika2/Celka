package celestial;

// $VF: synthetic class
class ZL {
   static {
      try {
         id_byte[rCD.SAVE.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         id_byte[rCD.LOAD.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         id_byte[rCD.CORNER.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         id_byte[rCD.DATA.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      id_break = new int[rqd_3.values().length];

      try {
         id_break[rqd_3.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         id_break[rqd_3.CLOCKWISE_180.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         id_break[rqd_3.COUNTERCLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         id_break[rqd_3.CLOCKWISE_90.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      id_class = new int[rpa_3.values().length];

      try {
         id_class[rpa_3.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         id_class[rpa_3.LEFT_RIGHT.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         id_class[rpa_3.FRONT_BACK.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
