import {React}  from 'react';

export  const MatchSamllCard =  ({match}) => {
  return (
    <div className="MatchSamllCard">
      <header>
      <p>{match.team1} v/s {match.team2}</p>
      </header>
    </div>
  );
}

