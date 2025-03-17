/**
 * 奖励
 */
public interface Award {
    int DOUBLE_FIRE = 0; // 双倍火力
    int LIFE = 1; // 1条命

    /**
     * 获得奖励类型(上面的 0 或 1)
     */
    int getType();
}
