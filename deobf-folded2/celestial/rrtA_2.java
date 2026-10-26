package celestial;

public interface rrtA_2 extends MinecraftAccessor {
   void id_byte();

   boolean id_class(char var1, int var2);

   void id_class(int var1, int var2, int var3);

   void id_class(float var1, float var2, float var3, float var4, int var5, int var6);

   default boolean id_class(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var3 + var5 && var2 >= var4 && var2 <= var4 + var6;
   }

   void id_class();

   void id_break();

   void id_break(int var1, int var2, int var3);
}
