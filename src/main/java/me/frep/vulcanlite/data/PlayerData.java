package me.frep.vulcanlite.data;

import lombok.Getter;
import me.frep.vulcanlite.data.impl.PositionProcessor;
import me.frep.vulcanlite.data.impl.RotationProcessor;
import org.bukkit.entity.Player;

@Getter
public class PlayerData {

    private final Player player;

    private final RotationProcessor rotationProcessor = new RotationProcessor(this);
    private final PositionProcessor positionProcessor = new PositionProcessor(this);

    public PlayerData(final Player player) {
        this.player = player;
    }
}
